import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * grep -A 1 'Metrics Vector:' WBS_JR_Collect.mode3_steps7.log | grep -v 'Metrics Vector' | cat grep 'void test' WBS_JR_Collect.mode3_steps7.log
 */
public class CollectPerfStats {
    static String header = ("bench, time,staticAnalysisTime,dynTime,npaths,solverCount,totalSolverTime,parseTime,cleanupTime,DistinctVeriRegionNum,DistinctSpfRegionNum,ConcreteRegionNum,FIELDREFERNCEINSTRUCTION,SPFCASEINSTRUCTION,MISSINGMETHODSUMMARY,OTHER,hgOrdRegionInstance,regionCount,SuccInstantiations,FailedInstantiations,ConcreteInstNum,FIELDREFERNCEINSTRUCTION,SPFCASEINSTRUCTION,MISSINGMETHODSUMMARY,OTHER,interestingRegionCount,numMethodSummaries,maxBranchDepth,maxExecPathCount,avgExecPathCount,staticPhaseEx,instPhaseEx,unknownPhaseEx, unitTests\n");

    public CollectPerfStats(String logFileName, String resultFile) throws IOException { //runs the shell
        String scriptName = "./scripts/extractPerformanceMetrics.sh";
        String commands[] = new String[]{scriptName, logFileName, resultFile, (logFileName.substring(logFileName.lastIndexOf("/") + 1)).replace(".log", "")};

        Runtime rt = Runtime.getRuntime();
        Process process = null;
        try {
            process = rt.exec(commands);
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void execute(String benchmark, String parentLogDir, boolean isPartialProblem) throws IOException {
        String resultsDir = parentLogDir + "perfOutput";

        if (!Files.exists(Paths.get(resultsDir)))
            Files.createDirectory(Paths.get(resultsDir));
        String resultFile = preparePerfLogFile(resultsDir, benchmark);
        String logFile = isPartialProblem ? parentLogDir + "logs/log_" + benchmark + "/partialproblem" : parentLogDir + "logs/log_" + benchmark;
        Path[] coverageStates = Files.list(Paths.get(logFile)).toArray(Path[]::new);
        for (Path file : coverageStates) {
            String logFileName = file.toString();
//            if (!logFileName.contains("Perf"))
            new CollectPerfStats(logFileName, resultFile);

        }
    }

    /**
     * creates the performance log file that will be contain the results for all configurations for a benchmark
     *
     * @param resultsDir
     * @return
     */
    private static String preparePerfLogFile(String resultsDir, String benchmark) throws IOException {
        String resultFile = resultsDir + "/" + benchmark + "_allPerf.txt";
        Path perfOutFile = Paths.get(resultFile);
        Files.deleteIfExists(perfOutFile);
        Files.createFile(perfOutFile);
        Files.write(perfOutFile, header.getBytes());
        return resultFile;
    }
}
