lista_data = LOAD '/user/maria_dev/4linux/u.data' as (usuarioID:int, filmeID: int, classificacao:int, data: int);

DUMP lista_data;

DESCRIBE lista_data;
