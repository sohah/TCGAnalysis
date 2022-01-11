#!/usr/bin/env python3
import numpy as np
import os
import pandas as pd

execution_log_dir = os.getcwd() + '/logs/coverage_log/'
content_dfs = []
df_columns = []
for benchmark_log_dir in os.listdir(execution_log_dir):
    for benchmark_log_file in os.listdir(os.path.join(execution_log_dir, benchmark_log_dir)):
        with open(os.path.join(execution_log_dir, benchmark_log_dir, benchmark_log_file),
                  'r') as f:
            content_df = pd.read_csv(f)
            file_name = f.name
            if 'ThreadStat_' in file_name:
                content_dfs.append(content_df[content_df.columns[1]][1:])
                mode = ''
                if '0' in file_name:
                    mode = 'SPF'
                elif '2' in file_name:
                    mode = 'mode2'
                elif '3' in file_name:
                    mode = 'mode3'
                elif '4' in file_name:
                    mode = 'mode4'
                elif '5' in file_name:
                    mode = 'mode5'
                else:
                    print('error wrong files.aborting')
                    exit(1)
                df_columns.append(benchmark_log_dir+'_' + mode)

    spf_df = ''
    jr_mode2 = ''
    jr_mode3 = ''
    jr_mode4 = ''
    jr_mode5 = ''

    for i in range(len(df_columns)):
        if 'SPF' in df_columns[i]:
            spf_df = content_dfs[i]
        elif 'mode2' in df_columns[i]:
            jr_mode2 = content_dfs[i]
        elif 'mode3' in df_columns[i]:
            jr_mode3 = content_dfs[i]
        elif 'mode4' in df_columns[i]:
            jr_mode4 = content_dfs[i]
        elif 'mode5' in df_columns[i]:
            jr_mode5 = content_dfs[i]
        else:
            print('error wrong files.aborting')
            exit(1)

    new_data_frame = pd.concat([spf_df, jr_mode2, jr_mode3, jr_mode4, jr_mode5])
    print(','.join(df_columns))

    new_data_frame.to_csv(benchmark_log_dir+'_combined_coverage_per_thread.cvs', axis = 1)
