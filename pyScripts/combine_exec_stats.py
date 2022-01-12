#!/usr/bin/env python3
import os
import pandas as pd

execution_log_dir = os.getcwd() + '/logs/coverage_log/'
# content_dfs = []
df_columns = []
i = 0
for benchmark_log_dir in os.listdir(execution_log_dir):
    for benchmark_log_file in os.listdir(os.path.join(execution_log_dir, benchmark_log_dir)):
        with open(os.path.join(execution_log_dir, benchmark_log_dir, benchmark_log_file), 'r') as f:
            content_df = pd.read_csv(f)
            file_name = f.name
            if '_ExecStat_' in file_name:
                # content_dfs.append(content_df[content_df.columns[0]])
                mode = ''
                if '0' in file_name:
                    mode = 'SPF'
                    spf_np = content_df[content_df.columns[0]].values
                    # print('spf found, printing column[0]')
                    # print(content_df[content_df.columns[0]])
                    # print('end')
                elif '2' in file_name:
                    mode = 'mode2'
                    jr_mode2 = content_df[content_df.columns[0]].values
                    # print('mode2 found, printing column[0]')
                    # print(content_df[content_df.columns[0]])
                    # print('end')
                elif '3' in file_name:
                    mode = 'mode3'
                    jr_mode3 = content_df[content_df.columns[0]].values
                    # print('mode3 found, printing column[0]')
                    # print(content_df[content_df.columns[0]])
                    # print('end')
                elif '4' in file_name:
                    mode = 'mode4'
                    jr_mode4 = content_df[content_df.columns[0]].values
                    # print('mode4 found, printing column[0]')
                    # print(content_df[content_df.columns[0]])
                    # print('end')
                elif '5' in file_name:
                    mode = 'mode5'
                    jr_mode5 = content_df[content_df.columns[0]].values
                    # print('mode5 found, printing column[0]')
                    # print(content_df[content_df.columns[0]])
                    # print('end')
                else:
                    print('error wrong files.aborting')
                    exit(1)
                df_columns.append(benchmark_log_dir+'_' + mode)
                i += 1

    # new_data_frame = pd.DataFrame([spf_df, jr_mode2, jr_mode3, jr_mode4, jr_mode5])
    df_columns.sort()
    # print(df_columns)
    print(','.join(df_columns))

    output_file = str(benchmark_log_dir) + '_combined_exec_stats.cvs'

    if(spf_np.size == 0 or jr_mode2.size == 0 or jr_mode3.size == 0 or jr_mode4.size == 0 or jr_mode5.size == 0):
        print('one run is missing. failing.')
        exit(1)

    with open(output_file, 'w') as output_file_pointer:
        output_file_pointer.write(','.join(df_columns))
        for i in range(max(spf_np.size, jr_mode2.size, jr_mode3.size, jr_mode4.size, jr_mode5.size)):
            spf_str = str(spf_np[i]) if i < spf_np.size else '_'
            jr_mode2_str = str(jr_mode2[i]) if i < jr_mode2.size else '_'
            jr_mode3_str = str(jr_mode3[i]) if i < jr_mode3.size else '_'
            jr_mode4_str = str(jr_mode4[i]) if i < jr_mode4.size else '_'
            jr_mode5_str = str(jr_mode5[i]) if i < jr_mode5.size else '_'

            line = '\n' + spf_str + "," + jr_mode2_str + ',' + jr_mode3_str + ',' + jr_mode4_str+',' + jr_mode5_str
            output_file_pointer.write(line)



    # new_data_frame.to_csv(output_file, mode='a', index=False, header=False)
