*if exist exiption in Librrary .... 

1- it will be in JDBC MySql Driver ...... you should add  this file "mysql-connector-java-5.1.42-bin.jar" 
   it exist in "jar/mysql-connector-java-5.1.42/"

2- reimport hibernate libs  called "Hibernate 4.3.x modlegate".  
3- reimport "log4j-1.2.17.jar" from folder "/jar/apache-log4j-1.2.17".

*MySQL Config
1- run MySQL server
2- create user  username : "SWDB"  password : "SWDB" if not exist
3- impor database file called "SEDB" from DB folder using "mysql -u SWDB -p -h localhost SWDB < SWDB.sql"		
5- run this command in MySQL "grant all on SWDB.* to 'SWDB' identified by 'SWDB';"
4- make connction with it using netbeans  
