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
-- Table structure for table `Accounts`
--

DROP TABLE IF EXISTS `Accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Accounts` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `blockState` bit(1) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accounts`
--

LOCK TABLES `Accounts` WRITE;
/*!40000 ALTER TABLE `Accounts` DISABLE KEYS */;
INSERT INTO `Accounts` VALUES (1,'¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·+âèÄx','\0','moroclash','mohamed','moroclash132','moroclash','01123111546'),(2,'¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·+&Î˝@x','','Emp1','loolooo','lalalallalal','alallalslsalsa','0121245121'),(3,'¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·+&Î˝@x','\0','moroclash','clash','moroclash','mloroclash','010112311154');
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
INSERT INTO `AdminAccount` VALUES (1);
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
INSERT INTO `Constraints` VALUES (1,12,14,15,15,104,12,14,15);
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
INSERT INTO `ConsumerAccount` VALUES (2,'12454512','cairo','1241215412154'),(3,'12-13-2014','cairo','124545451212145');
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
INSERT INTO `Counter` VALUES (1,'¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·,9Ñª@x'),(2,'¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·24¢…@x');
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
INSERT INTO `Employer` VALUES (2,1);
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
INSERT INTO `EmployerProfile` VALUES (1);
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
INSERT INTO `Experience` VALUES (1,'www.yahoo.com','yaaahooooooooooooooooooo','yahhhhhhhhhhhhhhhhhhhhhhhhhhhhoooooooooooooooooooo',3),(2,'www.google.com','llllllllllllllllllllllllllllllll','lllllllllllllllllllllllllllllllllllllllllllllllllllllllllll',3);
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
INSERT INTO `Experience_technologies` VALUES (1,1),(1,2),(2,1),(2,3),(2,4);
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
INSERT INTO `Feedback` VALUES (1,'¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·9≠#Äx','dasdkj kjkl jl jl kjalskdjl jl ',12,1,NULL);
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
INSERT INTO `Freelancer` VALUES (3,2014.12,2);
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
INSERT INTO `FreelancerProfile` VALUES (2,12);
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
INSERT INTO `Freelancer_skills` VALUES (3,1),(3,2),(3,3),(3,4);
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
INSERT INTO `LOGS` VALUES ('2017-05-04 18:31:27','dasdasdasd');
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
INSERT INTO `Offer` VALUES (1,1,'¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·,9ì˝Äx','dasdasd mdkaslkdklaskdl;ksald;kas;ldk;',12,12,3,1,12,1),(2,2,'¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·24≤Äx','dasdasd mdkaslkdklaskdl;ksald;kas;ldk;',12,12,3,1,12,1);
/*!40000 ALTER TABLE `Offer` ENABLE KEYS */;
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
INSERT INTO `Profile` VALUES (1,'dasd kdjsalk kljdsjal jlkjdlaskjd',12,'dasdsadasd ',124.1245,1),(2,'lsadklaskdlaskdjgffjlajlsafjl jldjsald',12,'/dasd/dasdas/ewq/rtere',15454.124,2);
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
INSERT INTO `Rate` VALUES (1,0),(2,145);
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
INSERT INTO `Skill` VALUES (1,'C++'),(2,'C'),(3,'Rouy'),(4,'java');
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
INSERT INTO `Task` VALUES (1,'loca','¨Ì\0sr\0\rjava.time.Serï]Ñ∫\"H≤\0\0xpw\0\0·+&Î˝@x',2,1,'dasdasd',22);
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

-- Dump completed on 2017-05-04 18:38:57
