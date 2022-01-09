#!/usr/bin/env python3
import os

execution_log_dir = os.getcwd() + '/logs/execution_log/'
for benchmark_log_dir in os.listdir(execution_log_dir):
    for benchmark_log_file in os.listdir(os.path.join(execution_log_dir, benchmark_log_dir)):
        with open(os.path.join(execution_log_dir, benchmark_log_dir, benchmark_log_file),
                  'r') as f:
            content = f.read()
            if 'class' not in f.name and 'mode3NoBatch' not in f.name and 'mode3PlainJR' not in f.name:
                unit_test_class = content[content.index('import static org.junit.Assert.*;'):content.index(
                    "====================================================== results")]
                with open(os.path.join(execution_log_dir, benchmark_log_dir, benchmark_log_file[:-4].replace('.','_') + "_Test.java"),
                          'w') as unit_test_class_file:
                    unit_test_class_file.write(unit_test_class)




