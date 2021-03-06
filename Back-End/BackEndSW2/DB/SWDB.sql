-- MySQL dump 10.16  Distrib 10.1.21-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: localhost
-- ------------------------------------------------------
-- Server version	10.1.21-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `AccNotification`
--

DROP TABLE IF EXISTS `AccNotification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AccNotification` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `massage` varchar(255) DEFAULT NULL,
  `state` bit(1) DEFAULT NULL,
  `FromAccount_id` int(11) NOT NULL,
  `ToAccount_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_2ktcnlkox8v1sh0djd47fekag` (`FromAccount_id`),
  KEY `FK_djbtnhgwaabfqihmbgkbfbsxr` (`ToAccount_id`),
  CONSTRAINT `FK_2ktcnlkox8v1sh0djd47fekag` FOREIGN KEY (`FromAccount_id`) REFERENCES `Accounts` (`id`),
  CONSTRAINT `FK_djbtnhgwaabfqihmbgkbfbsxr` FOREIGN KEY (`ToAccount_id`) REFERENCES `ConsumerAccount` (`Account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccNotification`
--

LOCK TABLES `AccNotification` WRITE;
/*!40000 ALTER TABLE `AccNotification` DISABLE KEYS */;
INSERT INTO `AccNotification` VALUES (1,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\0�\0x','fucj','\0',1,2),(2,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�6�\0x','fucj','\0',1,2),(3,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0����x','fucj','\0',1,2),(4,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�	*s��x','Wellcom sossoso in our freelancing system','\0',7,7),(5,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\n3��\0x','Bad News you make OverTimeRequist on Offer 4 and we applied penalty on your Rate -10%, thanx','\0',8,7),(6,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\r�L@x','Bad News you make OverTimeRequist on Offer 4 and we applied penalty on your Rate -10%, thanx','\0',8,7),(7,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\02\n��x','Bad News you are Canceled Offer 4 and we applied penalty on your Rate , thanx','\0',7,8),(8,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\nz\0x','Bad News you are Canceled Offer 4 and we applied penalty on your Rate , thanx','\0',7,8),(9,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0��Ҁx','Bad News you are Canceled Offer 4 and we applied penalty on your Rate , thanx','\0',7,8),(10,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�+��x','Bad News Offer 4 is Canceled by Freelancer \"sossoso\" and system applied penalty and your are retrive your mony :196 $ ,we are very sorry for your time','\0',7,8),(11,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0��րx','new Offer on Task : dasdasd   Id: 1','\0',7,1),(12,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�+%1|\0x','new Offer on Task : dasdasd   Id: 1','\0',7,1),(13,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�(&��@x','new Offer on Task : dasdasd   Id: 1','\0',7,1),(14,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�75:@x','Task : mmmmmmmmmmmmmmmmmmmmmm   Id: 1 is uploaded \n thanks.','\0',1,1);
/*!40000 ALTER TABLE `AccNotification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Accounts`
--

DROP TABLE IF EXISTS `Accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Accounts` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `accountState` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accounts`
--

LOCK TABLES `Accounts` WRITE;
/*!40000 ALTER TABLE `Accounts` DISABLE KEYS */;
INSERT INTO `Accounts` VALUES (1,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�)�4�x','mohadsamed',NULL,'moroclash','moroclash','dasd',1),(2,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�): ��\0x','mohadsamed',NULL,'daslkd;lsakd;lsa','daskdjlaskjd','1222222222222',1),(3,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0� ���x','moroclasj','mldaslm','dmasdaksd','moroclasj','s21345415',0),(4,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0� !G;�x','moroclasj','mldaslm','dmasdaksd','moroclasj','s21345415',0),(5,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0���\0x','omar','mohamed','moroclash','bbbbbbbbbbbbbbbb','01123111245',0),(6,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\"\ZI @x','mmamam','hamaaam','121212','morocldas','01212',0),(7,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�	&�@x','moro','ckas','dsadasdasdas','sossoso','12121212121',0),(8,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�;߀x','lalsl','dasd','dsadasd','dasdasdasdas','012121212',14);
/*!40000 ALTER TABLE `Accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AdminAccount`
--

DROP TABLE IF EXISTS `AdminAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AdminAccount` (
  `account_id` int(11) NOT NULL,
  PRIMARY KEY (`account_id`),
  CONSTRAINT `FK_ayottm3gi1c3xx9cj4kldq85t` FOREIGN KEY (`account_id`) REFERENCES `Accounts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AdminAccount`
--

LOCK TABLES `AdminAccount` WRITE;
/*!40000 ALTER TABLE `AdminAccount` DISABLE KEYS */;
INSERT INTO `AdminAccount` VALUES (6);
/*!40000 ALTER TABLE `AdminAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Constraints`
--

DROP TABLE IF EXISTS `Constraints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Constraints` (
  `id` int(11) NOT NULL,
  `em_cancelRunningTaskBudgetPenalty` int(11) DEFAULT NULL,
  `em_cancelRunningTaskPenalty` int(11) DEFAULT NULL,
  `em_rejectFinishedTaskBudgetPenalty` int(11) DEFAULT NULL,
  `em_rejectFinishedTaskPenalty` int(11) DEFAULT NULL,
  `fr_cancelingTaskPenalty` int(11) DEFAULT NULL,
  `fr_overtimePenalty` int(11) DEFAULT NULL,
  `fr_timeoutPenalty` int(11) DEFAULT NULL,
  `ourProfit` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Constraints`
--

LOCK TABLES `Constraints` WRITE;
/*!40000 ALTER TABLE `Constraints` DISABLE KEYS */;
INSERT INTO `Constraints` VALUES (1,10,10,10,10,10,10,0,10);
/*!40000 ALTER TABLE `Constraints` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ConsumerAccount`
--

DROP TABLE IF EXISTS `ConsumerAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ConsumerAccount` (
  `Account_id` int(11) NOT NULL,
  `birthDate` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `visaNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Account_id`),
  CONSTRAINT `FK_c197gw3kx98ab2akmojqrg0kv` FOREIGN KEY (`Account_id`) REFERENCES `Accounts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ConsumerAccount`
--

LOCK TABLES `ConsumerAccount` WRITE;
/*!40000 ALTER TABLE `ConsumerAccount` DISABLE KEYS */;
INSERT INTO `ConsumerAccount` VALUES (1,'12/12/12','Cairo','12345113312145121'),(2,'12/12/12','llllllllll','12345113312145121'),(3,NULL,'morocla','0212454121515'),(4,NULL,'morocla','0212454121515'),(5,'20202020','Cairo','111111111111111111111'),(7,'13131313','cairto','1210212021'),(8,'dasdasd','casc','0112124542');
/*!40000 ALTER TABLE `ConsumerAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Counter`
--

DROP TABLE IF EXISTS `Counter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Counter` (
  `id` int(11) NOT NULL,
  `deadline` tinyblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Counter`
--

LOCK TABLES `Counter` WRITE;
/*!40000 ALTER TABLE `Counter` DISABLE KEYS */;
INSERT INTO `Counter` VALUES (1,NULL),(2,NULL),(3,NULL),(4,NULL),(5,NULL),(6,NULL),(7,NULL);
/*!40000 ALTER TABLE `Counter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Employer`
--

DROP TABLE IF EXISTS `Employer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Employer` (
  `ConsumerAccount` int(11) NOT NULL,
  `profile` int(11) NOT NULL,
  PRIMARY KEY (`ConsumerAccount`),
  UNIQUE KEY `UK_s5mbhoiavuhi1e69lds055h2x` (`profile`),
  CONSTRAINT `FK_s5mbhoiavuhi1e69lds055h2x` FOREIGN KEY (`profile`) REFERENCES `EmployerProfile` (`profile_id`),
  CONSTRAINT `FK_tiwqort3fopxp3o3wrjvge6p6` FOREIGN KEY (`ConsumerAccount`) REFERENCES `ConsumerAccount` (`Account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employer`
--

LOCK TABLES `Employer` WRITE;
/*!40000 ALTER TABLE `Employer` DISABLE KEYS */;
INSERT INTO `Employer` VALUES (1,1),(2,2),(8,7);
/*!40000 ALTER TABLE `Employer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EmployerProfile`
--

DROP TABLE IF EXISTS `EmployerProfile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EmployerProfile` (
  `profile_id` int(11) NOT NULL,
  PRIMARY KEY (`profile_id`),
  CONSTRAINT `FK_7yavaut2whnrm10yp2eppb3ws` FOREIGN KEY (`profile_id`) REFERENCES `Profile` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EmployerProfile`
--

LOCK TABLES `EmployerProfile` WRITE;
/*!40000 ALTER TABLE `EmployerProfile` DISABLE KEYS */;
INSERT INTO `EmployerProfile` VALUES (1),(2),(7);
/*!40000 ALTER TABLE `EmployerProfile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Experience`
--

DROP TABLE IF EXISTS `Experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Experience` (
  `id` int(11) NOT NULL,
  `link` varchar(255) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `Account_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_90vm32g68a7gyxv1ip7iujgko` (`Account_id`),
  CONSTRAINT `FK_90vm32g68a7gyxv1ip7iujgko` FOREIGN KEY (`Account_id`) REFERENCES `Freelancer` (`ConsumerAccount`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Experience`
--

LOCK TABLES `Experience` WRITE;
/*!40000 ALTER TABLE `Experience` DISABLE KEYS */;
/*!40000 ALTER TABLE `Experience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Experience_technologies`
--

DROP TABLE IF EXISTS `Experience_technologies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Experience_technologies` (
  `experiance_id` int(11) NOT NULL,
  `Skill_id` int(11) NOT NULL,
  PRIMARY KEY (`experiance_id`,`Skill_id`),
  KEY `FK_t2qpl3f3vhg784owmi95ap6hf` (`Skill_id`),
  CONSTRAINT `FK_r4sx8j10b2dlv27rlev9jruxm` FOREIGN KEY (`experiance_id`) REFERENCES `Experience` (`id`),
  CONSTRAINT `FK_t2qpl3f3vhg784owmi95ap6hf` FOREIGN KEY (`Skill_id`) REFERENCES `Skill` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Experience_technologies`
--

LOCK TABLES `Experience_technologies` WRITE;
/*!40000 ALTER TABLE `Experience_technologies` DISABLE KEYS */;
/*!40000 ALTER TABLE `Experience_technologies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Feedback`
--

DROP TABLE IF EXISTS `Feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Feedback` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `description` varchar(255) DEFAULT NULL,
  `rateValue` int(11) DEFAULT NULL,
  `offer` int(11) NOT NULL,
  `profile_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_fhvwnr3wcy7g925tdljwjqx38` (`offer`),
  KEY `FK_ppxpde9aaa04jlkvs7ot1vyf1` (`profile_id`),
  CONSTRAINT `FK_fhvwnr3wcy7g925tdljwjqx38` FOREIGN KEY (`offer`) REFERENCES `Offer` (`id`),
  CONSTRAINT `FK_ppxpde9aaa04jlkvs7ot1vyf1` FOREIGN KEY (`profile_id`) REFERENCES `FreelancerProfile` (`Profile_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Feedback`
--

LOCK TABLES `Feedback` WRITE;
/*!40000 ALTER TABLE `Feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `Feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Freelancer`
--

DROP TABLE IF EXISTS `Freelancer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Freelancer` (
  `ConsumerAccount` int(11) NOT NULL,
  `balance` double DEFAULT NULL,
  `profile` int(11) NOT NULL,
  PRIMARY KEY (`ConsumerAccount`),
  UNIQUE KEY `UK_2gvr71rlt5hcntu6jr8m2ak38` (`profile`),
  CONSTRAINT `FK_2gvr71rlt5hcntu6jr8m2ak38` FOREIGN KEY (`profile`) REFERENCES `FreelancerProfile` (`Profile_id`),
  CONSTRAINT `FK_p0co79e7vc1h22ucarm0eysbo` FOREIGN KEY (`ConsumerAccount`) REFERENCES `ConsumerAccount` (`Account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Freelancer`
--

LOCK TABLES `Freelancer` WRITE;
/*!40000 ALTER TABLE `Freelancer` DISABLE KEYS */;
INSERT INTO `Freelancer` VALUES (3,1212121,3),(4,1212121,4),(5,11111111,5),(7,11120000000,6);
/*!40000 ALTER TABLE `Freelancer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FreelancerProfile`
--

DROP TABLE IF EXISTS `FreelancerProfile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FreelancerProfile` (
  `Profile_id` int(11) NOT NULL,
  `averageHourCost` int(11) DEFAULT NULL,
  PRIMARY KEY (`Profile_id`),
  CONSTRAINT `FK_fifqrqy1ayd8yllu1o4kexqtg` FOREIGN KEY (`Profile_id`) REFERENCES `Profile` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FreelancerProfile`
--

LOCK TABLES `FreelancerProfile` WRITE;
/*!40000 ALTER TABLE `FreelancerProfile` DISABLE KEYS */;
INSERT INTO `FreelancerProfile` VALUES (3,12),(4,12),(5,11111),(6,12);
/*!40000 ALTER TABLE `FreelancerProfile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Freelancer_skills`
--

DROP TABLE IF EXISTS `Freelancer_skills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Freelancer_skills` (
  `account_id` int(11) NOT NULL,
  `Skill_id` int(11) NOT NULL,
  PRIMARY KEY (`account_id`,`Skill_id`),
  KEY `FK_ajidodk15qb77k43b4l1ymreo` (`Skill_id`),
  CONSTRAINT `FK_8o1lx528ihnwrvld38vddjn4c` FOREIGN KEY (`account_id`) REFERENCES `Freelancer` (`ConsumerAccount`),
  CONSTRAINT `FK_ajidodk15qb77k43b4l1ymreo` FOREIGN KEY (`Skill_id`) REFERENCES `Skill` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Freelancer_skills`
--

LOCK TABLES `Freelancer_skills` WRITE;
/*!40000 ALTER TABLE `Freelancer_skills` DISABLE KEYS */;
INSERT INTO `Freelancer_skills` VALUES (7,1);
/*!40000 ALTER TABLE `Freelancer_skills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Invoice`
--

DROP TABLE IF EXISTS `Invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Invoice` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `price` double DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `offer` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_pbibk0dikldo32nx7ry4fr6ym` (`offer`),
  CONSTRAINT `FK_pbibk0dikldo32nx7ry4fr6ym` FOREIGN KEY (`offer`) REFERENCES `Offer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Invoice`
--

LOCK TABLES `Invoice` WRITE;
/*!40000 ALTER TABLE `Invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `Invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LOGS`
--

DROP TABLE IF EXISTS `LOGS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LOGS` (
  `DATED` datetime NOT NULL,
  `MESSAGE` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LOGS`
--

LOCK TABLES `LOGS` WRITE;
/*!40000 ALTER TABLE `LOGS` DISABLE KEYS */;
INSERT INTO `LOGS` VALUES ('2017-05-05 18:41:09','3 GetHisOffersHistory'),('2017-05-06 15:22:11','5 make Registration'),('2017-05-06 16:09:42','7 make Registration'),('2017-05-06 17:34:11','7 add new Skill'),('2017-05-06 17:48:47','7 add new Skill'),('2017-05-06 17:48:59','7 add new Skill'),('2017-05-06 17:49:10','7 add new Skill'),('2017-05-06 17:50:12','7 add new Skill'),('2017-05-06 17:52:33','7 add new Skill'),('2017-05-06 18:04:04','7 add new Skill'),('2017-05-06 18:14:17','7 add new Skill'),('2017-05-06 18:17:49','7 add new Skill'),('2017-05-06 18:18:08','7 add new Skill'),('2017-05-06 18:31:48','7 delete exist Skill'),('2017-05-06 18:33:37','7 delete exist Skill'),('2017-05-06 19:19:26','7 Rate Emplyeer 8'),('2017-05-06 19:20:25','7 Rate Emplyeer 8'),('2017-05-06 20:29:10','7 freelancer apply OverTimeRequist to offer : 4'),('2017-05-06 20:29:29','7 freelancer apply OverTimeRequist to offer : 4'),('2017-05-07 04:44:53','7 freelancer cancel offer : 4'),('2017-05-07 04:46:32','7 freelancer cancel offer : 4'),('2017-05-07 04:47:30','7 freelancer cancel offer : 4'),('2017-05-07 05:04:08','7 freelancer cancel offer : 4'),('2017-05-12 03:16:45','7  make Offer to Task : 1'),('2017-05-12 03:17:12','7  make Offer to Task : 1'),('2017-05-12 03:18:18','7  make Offer to Task : 1'),('2017-05-12 03:18:58','7  make Offer to Task : 1'),('2017-05-12 03:20:02','7  make Offer to Task : 1'),('2017-05-12 03:25:30','7  make Offer to Task : 1'),('2017-05-12 03:28:43','7  make Offer to Task : 1'),('2017-05-12 03:29:47','7  make Offer to Task : 1'),('2017-05-12 03:37:29','1 Employeer update Task : 1'),('2017-05-12 04:12:56','Task : 1 is uploaded');
/*!40000 ALTER TABLE `LOGS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Offer`
--

DROP TABLE IF EXISTS `Offer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Offer` (
  `id` int(11) NOT NULL,
  `counter` int(11) NOT NULL,
  `date` tinyblob,
  `description` varchar(255) DEFAULT NULL,
  `hourCost` int(11) DEFAULT NULL,
  `numberOfHours` int(11) DEFAULT NULL,
  `owner` int(11) NOT NULL,
  `state` int(11) DEFAULT NULL,
  `timeNeeded` int(11) DEFAULT NULL,
  `task` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_rd25wdc212jm3ea8g1m1ky1wx` (`counter`),
  KEY `FK_c0dir6acqma1ee1b63jef2621` (`owner`),
  KEY `FK_4hqfxkop0qocenqk0dwuopbc` (`task`),
  CONSTRAINT `FK_4hqfxkop0qocenqk0dwuopbc` FOREIGN KEY (`task`) REFERENCES `Task` (`id`),
  CONSTRAINT `FK_c0dir6acqma1ee1b63jef2621` FOREIGN KEY (`owner`) REFERENCES `Freelancer` (`ConsumerAccount`),
  CONSTRAINT `FK_rd25wdc212jm3ea8g1m1ky1wx` FOREIGN KEY (`counter`) REFERENCES `Counter` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Offer`
--

LOCK TABLES `Offer` WRITE;
/*!40000 ALTER TABLE `Offer` DISABLE KEYS */;
INSERT INTO `Offer` VALUES (1,1,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�%7\"6��x','dasdhjkasjd',22,14,7,7,14,1),(2,2,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�&!��@x','llllllllllllllllllll',22,14,7,1,14,1),(3,3,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�$5�v�x','mogamoga',12,14,7,2,14,2),(4,4,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�	z%�x','dasdjklv',12,14,7,4,14,3),(5,5,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�sY@x','moroclash moroclash moroclash',21,14,7,0,12,1),(6,6,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�+O��x','moroclash moroclash moroclash',21,14,7,0,12,1),(7,7,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�+s�@x','moroclash moroclash moroclash',21,14,7,0,12,1);
/*!40000 ALTER TABLE `Offer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OverTimeRequest`
--

DROP TABLE IF EXISTS `OverTimeRequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OverTimeRequest` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `description` varchar(255) DEFAULT NULL,
  `hoursNeeded` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `offer` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_mbqcggammme6vfn9h4ltgocrv` (`offer`),
  CONSTRAINT `FK_mbqcggammme6vfn9h4ltgocrv` FOREIGN KEY (`offer`) REFERENCES `Offer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OverTimeRequest`
--

LOCK TABLES `OverTimeRequest` WRITE;
/*!40000 ALTER TABLE `OverTimeRequest` DISABLE KEYS */;
INSERT INTO `OverTimeRequest` VALUES (1,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�(�\0x','daskjdlaskjdklj',122,0,4),(2,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�8.��x','daskjdlaskjdklj',122,0,4),(3,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\nN/�x','daskjdlaskjdklj',122,0,4),(4,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\'uQ�x','daskjdlaskjdklj',122,0,4);
/*!40000 ALTER TABLE `OverTimeRequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Profile`
--

DROP TABLE IF EXISTS `Profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Profile` (
  `id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `numberOfTasks` int(11) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `totalMoney` double DEFAULT NULL,
  `rate` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_2a1vpp7ph76arn5r82mgay4k0` (`rate`),
  CONSTRAINT `FK_2a1vpp7ph76arn5r82mgay4k0` FOREIGN KEY (`rate`) REFERENCES `Rate` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Profile`
--

LOCK TABLES `Profile` WRITE;
/*!40000 ALTER TABLE `Profile` DISABLE KEYS */;
INSERT INTO `Profile` VALUES (1,'dsadsadsaas',15,'moroclashmoroclashmoroclash',121212121212,NULL),(2,'dsadsadsaas',15,'llllllllllllllll',121212121212,NULL),(3,'moroclash morcjsadjsalk',14,'Dasdasdasd',1241512154,1),(4,'moroclash morcjsadjsalk',14,'Dasdasdasd',1241512154,2),(5,'testestestes',11111,'/bath /bath',1111111111111,3),(6,'testetstetstet',13,'check/chekc',11111100022222,4),(7,'loka',14,'sdasdasd',12121212,5);
/*!40000 ALTER TABLE `Profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Rate`
--

DROP TABLE IF EXISTS `Rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Rate` (
  `id` int(11) NOT NULL,
  `theRate` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Rate`
--

LOCK TABLES `Rate` WRITE;
/*!40000 ALTER TABLE `Rate` DISABLE KEYS */;
INSERT INTO `Rate` VALUES (1,12),(2,12),(3,80),(4,30),(5,100);
/*!40000 ALTER TABLE `Rate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Root`
--

DROP TABLE IF EXISTS `Root`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Root` (
  `id` int(11) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Root`
--

LOCK TABLES `Root` WRITE;
/*!40000 ALTER TABLE `Root` DISABLE KEYS */;
/*!40000 ALTER TABLE `Root` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Skill`
--

DROP TABLE IF EXISTS `Skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Skill` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Skill`
--

LOCK TABLES `Skill` WRITE;
/*!40000 ALTER TABLE `Skill` DISABLE KEYS */;
INSERT INTO `Skill` VALUES (1,'lolo'),(2,'bobo');
/*!40000 ALTER TABLE `Skill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Statistics`
--

DROP TABLE IF EXISTS `Statistics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Statistics` (
  `id` int(11) NOT NULL,
  `numberOfAcceptedTasks` int(11) DEFAULT NULL,
  `numberOfAdmins` int(11) DEFAULT NULL,
  `numberOfAllTasks` int(11) DEFAULT NULL,
  `numberOfBlockedPeople` int(11) DEFAULT NULL,
  `numberOfComplaints` int(11) DEFAULT NULL,
  `numberOfEmployers` int(11) DEFAULT NULL,
  `numberOfFreelancers` int(11) DEFAULT NULL,
  `numberOfRejectedTasks` int(11) DEFAULT NULL,
  `ourMoney` double DEFAULT NULL,
  `totalMoney` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Statistics`
--

LOCK TABLES `Statistics` WRITE;
/*!40000 ALTER TABLE `Statistics` DISABLE KEYS */;
INSERT INTO `Statistics` VALUES (1,15,1212,14,145,1212,14,14,12,12121212,100000000);
/*!40000 ALTER TABLE `Statistics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Task`
--

DROP TABLE IF EXISTS `Task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Task` (
  `id` int(11) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `date` tinyblob,
  `employer` int(11) NOT NULL,
  `state` int(11) DEFAULT NULL,
  `task` varchar(255) DEFAULT NULL,
  `timeTaken` int(11) DEFAULT NULL,
  `TaskPathinServer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_s5a3ogu6vw5q1ned77x7n8b7e` (`employer`),
  CONSTRAINT `FK_s5a3ogu6vw5q1ned77x7n8b7e` FOREIGN KEY (`employer`) REFERENCES `Employer` (`ConsumerAccount`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Task`
--

LOCK TABLES `Task` WRITE;
/*!40000 ALTER TABLE `Task` DISABLE KEYS */;
INSERT INTO `Task` VALUES (1,'dsadas','��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\"+\"��x',1,7,'mmmmmmmmmmmmmmmmmmmmmm',12,'Tasks/1'),(2,'dsadas','��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�\']r\0x',1,0,'dasd',12,NULL),(3,'dasdasd','��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�*��@x',8,4,'Dasdas',12,NULL);
/*!40000 ALTER TABLE `Task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Task_technologies`
--

DROP TABLE IF EXISTS `Task_technologies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Task_technologies` (
  `task_id` int(11) NOT NULL,
  `Skill_id` int(11) NOT NULL,
  PRIMARY KEY (`task_id`,`Skill_id`),
  KEY `FK_7jfc8667po7hxgbq4maogt2gh` (`Skill_id`),
  CONSTRAINT `FK_7jfc8667po7hxgbq4maogt2gh` FOREIGN KEY (`Skill_id`) REFERENCES `Skill` (`id`),
  CONSTRAINT `FK_slogfv8seeja9f01suw2w1khf` FOREIGN KEY (`task_id`) REFERENCES `Task` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Task_technologies`
--

LOCK TABLES `Task_technologies` WRITE;
/*!40000 ALTER TABLE `Task_technologies` DISABLE KEYS */;
/*!40000 ALTER TABLE `Task_technologies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaints`
--

DROP TABLE IF EXISTS `complaints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `complaints` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `owner` int(11) NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  `seenState` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_q9ugoqrt3n4mr1rhyovg6k9r5` (`owner`),
  CONSTRAINT `FK_q9ugoqrt3n4mr1rhyovg6k9r5` FOREIGN KEY (`owner`) REFERENCES `ConsumerAccount` (`Account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaints`
--

LOCK TABLES `complaints` WRITE;
/*!40000 ALTER TABLE `complaints` DISABLE KEYS */;
INSERT INTO `complaints` VALUES (1,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�3(0���x',1,'daskdjlaskjdlask',2),(2,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�76L��x',1,'daskdjlaskjdlask',2),(3,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�0%�K�x',1,'daskdjlaskjdlask',2),(4,'��\0sr\0\rjava.time.Ser�]��\"H�\0\0xpw\0\0�6\'\"���x',1,'lllllllllllllllllllllllllll',0);
/*!40000 ALTER TABLE `complaints` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaints_replies`
--

DROP TABLE IF EXISTS `complaints_replies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `complaints_replies` (
  `Complain_Id` int(11) NOT NULL,
  `Replay_Id` int(11) NOT NULL,
  PRIMARY KEY (`Complain_Id`,`Replay_Id`),
  KEY `FK_mke71tm587egkl75jm28wemd7` (`Replay_Id`),
  CONSTRAINT `FK_lngprkd4ceois79x7xdvy4kna` FOREIGN KEY (`Complain_Id`) REFERENCES `complaints` (`id`),
  CONSTRAINT `FK_mke71tm587egkl75jm28wemd7` FOREIGN KEY (`Replay_Id`) REFERENCES `complaints` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaints_replies`
--

LOCK TABLES `complaints_replies` WRITE;
/*!40000 ALTER TABLE `complaints_replies` DISABLE KEYS */;
INSERT INTO `complaints_replies` VALUES (2,1),(3,1);
/*!40000 ALTER TABLE `complaints_replies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-13  0:19:25
