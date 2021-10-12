# Big Data Assignments
## Process  

- Clone this repository to your local workspace .Write your solution checkin the code 
  to your github account and share us the repository link for evaluation.
  
## Problem1

From the sample data given below, remove duplicates on the combination of Name and Age and print results.  
• Solve this problem by using simple data structures given in scala programming language.
• Please try to optimize the solution for efficiency in terms of space and time.

```
+--------------------+------+
| Name|Age|Location|
+--------------------+------+
|Rajesh|21|London|
|Suresh|28|California|
|Sam   |26|Delhi|
|Rajesh|21|Gurgaon|
|Manish|29|Bengaluru|
|Manish|33|Hyd|
+--------------------+------+
```

### Expected output
```
+--------------------+------+
| Name|Age|Location|
+--------------------+------+
|Rajesh|21|London|
|Suresh|28|California|
|Sam   |26|Delhi|
|Manish|29|Bengaluru|
|Manish|33|Hyd|
+--------------------+------+
```
Note:Above table structure of data for referential purpose .In real problem data will be present as list
Traverse to ```com.coding.assignment.problem1``` and open the  ```RemoveDuplicates.scala``` . 
Write the logic for removing the duplicates from the list

## Problem2

Inside data folder there is two data sets
• Flight details with departure,arrival ,airport codes 
• Airport details with codes

Analyze the above data and find below KPI
- Get the number of flights  which are delayed  in departure  and number of flights delayed in arrival everyday along with
  number of flights  departed  for each day
    •Output should contain 4 columns  FlightDate,FlightCount,DepDelayedCount,ArrDelayedCount
    •FlightDate should be in YYYY-MM-dd format
    •Data should be sorted in ascending order  by flightdate
  
- Get List of airports in US  from which flights are not departed in the month  of  2008 January
  •Output should contain 4 columns  City,State,Country,IATA (i.e airport code)
  
Traverse to ```com.coding.assignment.problem2``` and open  ```AirlineDataAnalysis.scala``` .You can write your logic in the same scala object.

  
## Problem3

Given a time series data which is a clickstream of user activity, task is to enrich the data with session id.

**Session Definition:**
- Session expires after inactivity of 30 mins, because of inactivity no clickstream record will be generated.
- Session remains active for a total duration of 2 hours

**Steps:**
- Use spark batch (Scala) to do the computation on given dataframe.
- Save the results in delta table(https://delta.io/)) with enriched data.



```
+--------------------+------+
|           timestamp|userid|
+--------------------+------+
|2021-01-01T11:00:00Z|    u1|
|2021-01-01T12:00:00Z|    u1|
|2021-01-01T11:00:00Z|    u2|
|2021-01-02T11:00:00Z|    u2|
|2021-01-01T12:15:00Z|    u1|
|2021-01-01T12:44:00Z|    u1|
|2021-01-01T13:00:00Z|    u1|
|2021-01-01T13:27:00Z|    u1|
|2021-01-01T13:55:00Z|    u1|
|2021-01-01T14:15:00Z|    u1|
+--------------------+------+
```
### Expected Output
```
+------+--------------------+-------+
|userid|Timestamp           |Session|
+------+--------------------+-------+
|u1    |2021-01-01T11:00:00Z|s1     |
|u1    |2021-01-01T12:00:00Z|s2     |
|u1    |2021-01-01T12:15:00Z|s2     |
|u1    |2021-01-01T12:44:00Z|s2     |
|u1    |2021-01-01T13:00:00Z|s2     |
|u1    |2021-01-01T13:27:00Z|s2     |
|u1    |2021-01-01T13:55:00Z|s2     |
|u1    |2021-01-01T14:15:00Z|s3     |
|u2    |2021-01-01T11:00:00Z|s1     |
|u2    |2021-01-02T11:00:00Z|s2     |
+------+--------------------+-------+
```

Traverse to ```com.coding.assignment.problem3``` and open ```ClickStreamAnalysis.scala``` .Dataframe with above data is already present.
Write logic to enrich it with session

#### Note:You are free to add any extra dependency if you need in build.sbt
