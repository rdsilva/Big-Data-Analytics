-- carregando os dados
data = load 'flightdelays' using org.apache.hive.hcatalog.pig.HCatLoader();


-- filtrando os dados
data_filtered = filter data by (int) $6 > 0;


-- ordernando os dados
result = order data_filtered by $6 desc parallel 3;


-- verificando os resultados
describe result;


-- salvando os resultados
store result into '/user/maria_dev/simulado/task_05' using PigStorage(',');
