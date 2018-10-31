-- carregando o arquivo
data = load '/user/maria_dev/simulado/task_02/flight_delays_cleaned/' using PigStorage(';');


-- filtrando os dados para Dest = DEN
data_filtered = filter data by (chararray) $8 == 'DEN';


-- agrupando as entradas
data_grouped = group data_filtered all;


-- contando as linhas
result = foreach data_grouped generate COUNT(data_filtered.$0);


-- dump result;

-- salvando o resultado
store result into '/user/maria_dev/simulado/task_03/sub_task_2/amount_flights_delayed';
