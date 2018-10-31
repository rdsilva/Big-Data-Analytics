lista_data = LOAD '/user/maria_dev/u.data';

cla_filme = FILTER lista_data BY (float)$2 >= 3.0 AND (int)$1 > 100;

DUMP cla_filme;
