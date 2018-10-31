funcionarios_json = LOAD '/user/maria_dev/funcionarios.json' USING JsonLoader ('id_func:int, nome:chararray, cargo:chararray, salario:chararray, departamento:chararray');

x =  LIMIT funcionarios_json 10;

DUMP x;

STORE funcionarios_json INTO '/user/maria_dev/funcionariosJson' USING JsonStorage();
