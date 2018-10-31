lista_data = LOAD '/user/maria_dev/u.data';

SPLIT lista_data INTO classificacao_menores if (int)$2 < 3.0, classificacao_maiores if (int)$2 > 3.0;

menores = LIMIT classificacao_menores 5;

maiores = LIMIT classificacao_maiores 5;

DUMP menores;

DUMP maiores;
