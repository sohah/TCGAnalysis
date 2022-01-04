import sys
import os
import pandas as pd

if len(sys.argv) != 1:
    print('wrong number of argument only pass the directory of the log files to extract the unit tests')
    exit(1)

index = 0

obligation_value = pd.Series(dtype='object')  # holds the obligations to compare to the following checked obligations, initially empty
execution_log_dir = os.getcwd() + '/logs/coverage_log/'
for benchmark_log_dir in os.listdir(execution_log_dir):
    for benchmark_log_file in os.listdir(os.path.join(execution_log_dir, benchmark_log_dir)):
        with open(os.path.join(execution_log_dir, benchmark_log_dir, benchmark_log_file),
                  'r') as f:
            content_df = pd.read_csv(f)
            if 'OblgOnlyStat_' in f.name:

                content_df = content_df.iloc[:-1]

                if obligation_value.empty:
                    obligation_value = content_df
                    print('match for ', f.name)
                else:
                    # get only the first column, get its index which is the obligation data, then sort those
                    obligation_value_series = obligation_value[obligation_value.columns[0]].index.sort_values()
                    content_df_series = content_df[content_df.columns[0]].index.sort_values()
                    if not obligation_value_series.equals(content_df_series):
                        print('size of obligation or values are not the same for ', f, 'aborting.')
                        exit(1)
                    else:
                        print('match for ', f.name)
    print('all matching for ', benchmark_log_dir)
    obligation_value = pd.Series(dtype='object')



