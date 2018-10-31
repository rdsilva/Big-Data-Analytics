lista_data = LOAD '/user/maria_dev/u.data';

lista_item = LOAD '/user/maria_dev/u.item' USING PigStorage('|') AS (filmeID:int, filmeTitulo:chararray, dataLancamento:chararray, videoLancamento:chararray, link:chararray);

left_outer_join = JOIN lista_data BY (int)$1 LEFT OUTER, lista_item BY filmeID; --(int)$0;

DUMP left_outer_join;
