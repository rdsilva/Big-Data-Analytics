-- Gerar uma lista com filmes com a media de classificacao maior que 3
-- Filtrar apenas as colunas filmeID, filmeTitulo e Classificação
-- Ordenar o resultado pela Classificação de forma decrescente

-- datasets
data = LOAD '/user/maria_dev/u.data' AS (usuarioId:int, filmeId:int, classificacao:int, data:int);
item = LOAD '/user/maria_dev/u.item' USING PigStorage('|') AS (filmeId:int, filmeTitulo:chararray, dataLancamento:chararray, videoLancamento:chararray, link:chararray);

-- calculando as médias
data_grp = GROUP data BY filmeId;
data_avg = FOREACH data_grp GENERATE group as filmeId, AVG(data.classificacao) AS classificacao;

DESCRIBE data_avg;

-- agrupando 
joined = JOIN data_avg BY filmeId, item BY filmeId;

DESCRIBE joined;

-- filtrando colunas
filmes = FOREACH joined GENERATE (int) data_avg::filmeId, (chararray) item::filmeTitulo, (float) data_avg::classificacao;

DESCRIBE filmes;

-- resultado
resultado_ordered = ORDER filmes BY classificacao DESC;
resultado = FILTER resultado_ordered BY classificacao > 3.0;

-- apresentando o resultado
resultado_limit = LIMIT resultado 10;
DUMP resultado_limit;
