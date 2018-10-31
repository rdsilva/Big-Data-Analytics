-- join

lista_data = LOAD '/user/maria_dev/u.data';

lista_item = LOAD '/user/maria_dev/u.item' USING PigStorage('|');

inner_join = JOIN lista_data BY (int)$1, lista_item BY (int)$0;

-- DESCRIBE só funciona se o schema tiver sido definido
-- DESCRIBE inner_join;

DUMP inner_join;
