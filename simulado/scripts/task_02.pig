-- carregando so dados
data = LOAD '/user/maria_dev/simulado/flightdelays/' using PigStorage(',');


-- removendo os dados NA de DepTime($4) das entradas
data_filtrado = filter data by (chararray) $4 != 'NA'; 


-- selecionando apenas as colunas desejadas
-- Year $0 
-- Month $1
-- DayofMonth $2
-- DepTime $4
-- UniqueCarrier $8
-- FlightNum $9
-- ArrDelays $14
-- Origin $16
-- Dest $17

result = foreach data_filtrado generate (chararray) $0 as Year, (chararray) $1 as Month, (chararray) $2 as DayofMonth,
(chararray) $4 as DepTime, (chararray) $8 as UniqueCarrier, (chararray) $9 as FlightNum, (chararray) $14 as ArrDelays,
(chararray) $16 as Origin, (chararray) $17 as Dest;

-- test = limit result 15;
-- dump test;

-- salvando os resultados
store result into '/user/maria_dev/simulado/task_02/flight_delays_cleaned' using PigStorage(';');
