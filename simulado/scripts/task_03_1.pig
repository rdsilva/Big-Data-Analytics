-- carregando o arquivo
data = load '/user/maria_dev/simulado/task_02/flight_delays_cleaned/' using PigStorage(';');


-- agrupando as entradas
data_grouped = group data all;


-- contando as linhas
result = foreach data_grouped generate COUNT(data.$0);

-- dump result;

-- salvando o resultado
store result into '/user/maria_dev/simulado/task_03/sub_task_1/amount_flights_delayed';
