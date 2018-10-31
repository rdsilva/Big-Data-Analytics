lista_item = LOAD '/user/maria_dev/4linux/u.item' USING PigStorage('|') AS (filmeID: int, filmeTitulo: chararray, dataLancamento: chararray, videoLancamento: chararray, link: chararray);

DUMP lista_item;

STORE lista_item INTO 'outputItem' USING PigStorage (';');
