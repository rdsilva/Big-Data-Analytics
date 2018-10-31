lista_usuario_dados = LOAD '/user/maria_dev/u.data' as (usuario_id:int, filmeId: int, classificacao: int,data:int);

mediaClassificacaoFilme = GROUP lista_usuario_dados by filmeId;

mediamaior = FOREACH mediaClassificacaoFilme  GENERATE group as filmeId, AVG(lista_usuario_dados.classificacao) as media;
             
lista_data_filtrada = FILTER mediamaior by media > 3.0;

lista_data_colunas = foreach mediamaior generate (chararray) filmeId, (int) media;

-- /dump lista_data_filtrada;/
lista_filme = LOAD '/user/maria_dev/u.item' USING PigStorage('|') as (filmeID: int, filmeTitulo: chararray, dataLAncamento: chararray, videoLAncamento: chararray, link:chararray);
                 
lista_itens_coluna = foreach lista_filme generate (chararray) filmeID, (chararray) filmeTitulo;
 
-- /JOIN/
inner_join = JOIN lista_data_colunas by filmeId, lista_itens_coluna by filmeID;

resultado = foreach inner_join generate (chararray) lista_data_colunas::filmeId, (chararray) lista_itens_coluna::filmeTitulo; 
-- /resultado_unique = distinct resultado;/

resultado_ordenado = order resultado by lista_itens_coluna::filmeTitulo;

dump resultado_ordenado;
