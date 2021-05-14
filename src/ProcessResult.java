import java.io.IOException;

//used to process results from the TCG
public class ProcessResult {

    //example of the right configuration is either nonPartial problem and it would be something like: wbs /media/soha/DATA/git/ProcessTCG/logs/oneRunDir/ false
    // or a configuration of a partial problem and in this case the configuration will be: wbs /media/soha/DATA/git/ProcessTCG/logs/oneRunDir/ true
    public static void main(String[] args) throws IOException {

        assert args.length == 1 : "unexpected input";
        String benchmark = args[0];
        String dir = args[1];
        boolean isPartialProblem = args[2].equals("true");

        CollectExecutionStats.execute(CoverageStatsType.ExecStat, benchmark, dir);
        CollectExecutionStats.execute(CoverageStatsType.ThreadStat, benchmark, dir);
        CollectPerfStats.execute(benchmark, dir, isPartialProblem);
    }
}
