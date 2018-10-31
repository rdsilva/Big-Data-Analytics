ratings = LOAD '/user/maria_dev/u.data' AS (userID:int, movieID:int, rating:int, ratingTime:int);

ratingsByMovie = GROUP ratings BY movieID;

ratingsAvg = FOREACH ratingsByMovie GENERATE group AS movieID, AVG(ratings.rating) AS avg;

ratingsAvgOrdered = ORDER ratingsAvg BY avg ASC;

DUMP ratingsAvgOrdered;
