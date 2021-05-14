#!/bin/bash

#takes as input the log file of any run and prints the MetricsVector along with the number of test cases prodcuced.
#also it takes the second input which is the file to produce the output to.

LOGFILE=$1
OUTPUTFILE=$2
PUREFILENAME=$3

METRICVECTOR=$(grep -A 1 --binary-files=text 'Metrics Vector:' ${LOGFILE} | grep -v 'Metrics Vector')

TESTCASESNUM=$(grep --binary-files=text 'void test' ${LOGFILE} | wc -l)

echo ${PUREFILENAME},${METRICVECTOR},${TESTCASESNUM} >> ${OUTPUTFILE}
echo