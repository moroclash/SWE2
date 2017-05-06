-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2017 at 09:45 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `swdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `accnotification`
--

CREATE TABLE `accnotification` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `massage` varchar(255) DEFAULT NULL,
  `state` bit(1) DEFAULT NULL,
  `FromAccount_id` int(11) NOT NULL,
  `ToAccount_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accnotification`
--

INSERT INTO `accnotification` (`id`, `date`, `massage`, `state`, `FromAccount_id`, `ToAccount_id`) VALUES
(0, NULL, 'asjdh', b'1', 2, 2),
(1, NULL, 'asjdh', b'1', 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `blockState` bit(1) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `accountState` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`id`, `date`, `blockState`, `firstName`, `lastName`, `password`, `userName`, `phone`, `accountState`) VALUES
(1, 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770e05000007e10502142b1f1b898f8078, b'0', 'moroclash', 'mohamed', 'moroclash132', 'moroclash', '01123111546', 1),
(2, 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770e05000007e10502142b1f26ebfd4078, b'1', 'Emp1', 'loolooo', 'lalalallalal', 'alallalslsalsa', '0121245121', 1),
(3, 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770e05000007e10502142b1f26ebfd4078, b'0', 'moroclash', 'clash', 'moroclash', 'mloroclash', '010112311154', 1);

-- --------------------------------------------------------

--
-- Table structure for table `adminaccount`
--

CREATE TABLE `adminaccount` (
  `account_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminaccount`
--

INSERT INTO `adminaccount` (`account_id`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `complaints`
--

CREATE TABLE `complaints` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `owner` int(11) NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  `seenState` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `complaints`
--

INSERT INTO `complaints` (`id`, `date`, `owner`, `message`, `seenState`) VALUES
(1, NULL, 2, 'a7a', 1);

-- --------------------------------------------------------

--
-- Table structure for table `complaints_replies`
--

CREATE TABLE `complaints_replies` (
  `Complain_Id` int(11) NOT NULL,
  `Replay_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `complaints_replies`
--

INSERT INTO `complaints_replies` (`Complain_Id`, `Replay_Id`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `constraints`
--

CREATE TABLE `constraints` (
  `id` int(11) NOT NULL,
  `em_cancelRunningTaskBudgetPenalty` int(11) DEFAULT NULL,
  `em_cancelRunningTaskPenalty` int(11) DEFAULT NULL,
  `em_rejectFinishedTaskBudgetPenalty` int(11) DEFAULT NULL,
  `em_rejectFinishedTaskPenalty` int(11) DEFAULT NULL,
  `fr_cancelingTaskPenalty` int(11) DEFAULT NULL,
  `fr_overtimePenalty` int(11) DEFAULT NULL,
  `fr_timeoutPenalty` int(11) DEFAULT NULL,
  `ourProfit` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `constraints`
--

INSERT INTO `constraints` (`id`, `em_cancelRunningTaskBudgetPenalty`, `em_cancelRunningTaskPenalty`, `em_rejectFinishedTaskBudgetPenalty`, `em_rejectFinishedTaskPenalty`, `fr_cancelingTaskPenalty`, `fr_overtimePenalty`, `fr_timeoutPenalty`, `ourProfit`) VALUES
(0, 8, 8, 8, 8, 8, 8, 8, 8),
(1, 12, 14, 15, 15, 104, 12, 14, 15);

-- --------------------------------------------------------

--
-- Table structure for table `consumeraccount`
--

CREATE TABLE `consumeraccount` (
  `Account_id` int(11) NOT NULL,
  `birthDate` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `visaNumber` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consumeraccount`
--

INSERT INTO `consumeraccount` (`Account_id`, `birthDate`, `country`, `visaNumber`) VALUES
(2, '12454512', 'cairo', '1241215412154'),
(3, '12-13-2014', 'cairo', '124545451212145');

-- --------------------------------------------------------

--
-- Table structure for table `counter`
--

CREATE TABLE `counter` (
  `id` int(11) NOT NULL,
  `deadline` tinyblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `counter`
--

INSERT INTO `counter` (`id`, `deadline`) VALUES
(1, 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770e05000007e10502142c043984bb4078),
(2, 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770e05000007e1050214323403a2c94078);

-- --------------------------------------------------------

--
-- Table structure for table `employer`
--

CREATE TABLE `employer` (
  `ConsumerAccount` int(11) NOT NULL,
  `profile` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employer`
--

INSERT INTO `employer` (`ConsumerAccount`, `profile`) VALUES
(2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `employerprofile`
--

CREATE TABLE `employerprofile` (
  `profile_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employerprofile`
--

INSERT INTO `employerprofile` (`profile_id`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `experience`
--

CREATE TABLE `experience` (
  `id` int(11) NOT NULL,
  `link` varchar(255) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `Account_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `experience`
--

INSERT INTO `experience` (`id`, `link`, `picture`, `summary`, `Account_id`) VALUES
(1, 'www.yahoo.com', 'yaaahooooooooooooooooooo', 'yahhhhhhhhhhhhhhhhhhhhhhhhhhhhoooooooooooooooooooo', 3),
(2, 'www.google.com', 'llllllllllllllllllllllllllllllll', 'lllllllllllllllllllllllllllllllllllllllllllllllllllllllllll', 3);

-- --------------------------------------------------------

--
-- Table structure for table `experience_technologies`
--

CREATE TABLE `experience_technologies` (
  `experiance_id` int(11) NOT NULL,
  `Skill_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `experience_technologies`
--

INSERT INTO `experience_technologies` (`experiance_id`, `Skill_id`) VALUES
(1, 1),
(1, 2),
(2, 1),
(2, 3),
(2, 4);

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `description` varchar(255) DEFAULT NULL,
  `rateValue` int(11) DEFAULT NULL,
  `offer` int(11) NOT NULL,
  `profile_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `date`, `description`, `rateValue`, `offer`, `profile_id`) VALUES
(1, 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770e05000007e1050214391c18ad238078, 'dasdkj kjkl jl jl kjalskdjl jl ', 12, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `freelancer`
--

CREATE TABLE `freelancer` (
  `ConsumerAccount` int(11) NOT NULL,
  `balance` double DEFAULT NULL,
  `profile` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `freelancer`
--

INSERT INTO `freelancer` (`ConsumerAccount`, `balance`, `profile`) VALUES
(3, 2014.12, 2);

-- --------------------------------------------------------

--
-- Table structure for table `freelancerprofile`
--

CREATE TABLE `freelancerprofile` (
  `Profile_id` int(11) NOT NULL,
  `averageHourCost` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `freelancerprofile`
--

INSERT INTO `freelancerprofile` (`Profile_id`, `averageHourCost`) VALUES
(2, 12);

-- --------------------------------------------------------

--
-- Table structure for table `freelancer_skills`
--

CREATE TABLE `freelancer_skills` (
  `account_id` int(11) NOT NULL,
  `Skill_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `freelancer_skills`
--

INSERT INTO `freelancer_skills` (`account_id`, `Skill_id`) VALUES
(3, 1),
(3, 2),
(3, 3),
(3, 4);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `id` int(11) NOT NULL,
  `date` tinyblob,
  `price` double DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `offer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id`, `date`, `price`, `state`, `offer`) VALUES
(0, NULL, 99, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `DATED` datetime NOT NULL,
  `MESSAGE` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`DATED`, `MESSAGE`) VALUES
('2017-05-05 18:43:42', 'User 4 is LogOut'),
('2017-05-05 18:43:54', 'Usder 4 is LogOut'),
('2017-05-05 18:46:10', 'Usder 4 is LogOut');

-- --------------------------------------------------------

--
-- Table structure for table `offer`
--

CREATE TABLE `offer` (
  `id` int(11) NOT NULL,
  `counter` int(11) NOT NULL,
  `date` tinyblob,
  `description` varchar(255) DEFAULT NULL,
  `hourCost` int(11) DEFAULT NULL,
  `numberOfHours` int(11) DEFAULT NULL,
  `owner` int(11) NOT NULL,
  `state` int(11) DEFAULT NULL,
  `timeNeeded` int(11) DEFAULT NULL,
  `task` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `offer`
--

INSERT INTO `offer` (`id`, `counter`, `date`, `description`, `hourCost`, `numberOfHours`, `owner`, `state`, `timeNeeded`, `task`) VALUES
(1, 1, 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770e05000007e10502142c043993fd8078, 'dasdasd mdkaslkdklaskdl;ksald;kas;ldk;', 12, 12, 3, 1, 12, 1),
(2, 2, 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770e05000007e1050214323403b20b8078, 'dasdasd mdkaslkdklaskdl;ksald;kas;ldk;', 12, 12, 3, 1, 12, 1);

-- --------------------------------------------------------

--
-- Table structure for table `profile`
--

CREATE TABLE `profile` (
  `id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `numberOfTasks` int(11) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `totalMoney` double DEFAULT NULL,
  `rate` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profile`
--

INSERT INTO `profile` (`id`, `description`, `numberOfTasks`, `picture`, `totalMoney`, `rate`) VALUES
(1, 'dasd kdjsalk kljdsjal jlkjdlaskjd', 12, 'dasdsadasd ', 124.1245, 1),
(2, 'lsadklaskdlaskdjgffjlajlsafjl jldjsald', 12, '/dasd/dasdas/ewq/rtere', 15454.124, 2);

-- --------------------------------------------------------

--
-- Table structure for table `rate`
--

CREATE TABLE `rate` (
  `id` int(11) NOT NULL,
  `theRate` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rate`
--

INSERT INTO `rate` (`id`, `theRate`) VALUES
(1, 0),
(2, 145);

-- --------------------------------------------------------

--
-- Table structure for table `root`
--

CREATE TABLE `root` (
  `id` int(11) NOT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `skill`
--

CREATE TABLE `skill` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `skill`
--

INSERT INTO `skill` (`id`, `name`) VALUES
(1, 'C++'),
(2, 'C'),
(3, 'Rouy'),
(4, 'java');

-- --------------------------------------------------------

--
-- Table structure for table `statistics`
--

CREATE TABLE `statistics` (
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
  `totalMoney` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE `task` (
  `id` int(11) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `date` tinyblob,
  `employer` int(11) NOT NULL,
  `state` int(11) DEFAULT NULL,
  `task` varchar(255) DEFAULT NULL,
  `timeTaken` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task`
--

INSERT INTO `task` (`id`, `category`, `date`, `employer`, `state`, `task`, `timeTaken`) VALUES
(0, 'jhjh', NULL, 2, 1, 'kj', 6),
(6, 'jhjh', NULL, 2, 1, 'kj', 6),
(7, NULL, NULL, 2, 0, NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `task_technologies`
--

CREATE TABLE `task_technologies` (
  `task_id` int(11) NOT NULL,
  `Skill_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task_technologies`
--

INSERT INTO `task_technologies` (`task_id`, `Skill_id`) VALUES
(0, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accnotification`
--
ALTER TABLE `accnotification`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_2ktcnlkox8v1sh0djd47fekag` (`FromAccount_id`),
  ADD KEY `FK_djbtnhgwaabfqihmbgkbfbsxr` (`ToAccount_id`);

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `adminaccount`
--
ALTER TABLE `adminaccount`
  ADD PRIMARY KEY (`account_id`);

--
-- Indexes for table `complaints`
--
ALTER TABLE `complaints`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_q9ugoqrt3n4mr1rhyovg6k9r5` (`owner`);

--
-- Indexes for table `complaints_replies`
--
ALTER TABLE `complaints_replies`
  ADD PRIMARY KEY (`Complain_Id`,`Replay_Id`),
  ADD KEY `FK_mke71tm587egkl75jm28wemd7` (`Replay_Id`);

--
-- Indexes for table `constraints`
--
ALTER TABLE `constraints`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `consumeraccount`
--
ALTER TABLE `consumeraccount`
  ADD PRIMARY KEY (`Account_id`);

--
-- Indexes for table `counter`
--
ALTER TABLE `counter`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employer`
--
ALTER TABLE `employer`
  ADD PRIMARY KEY (`ConsumerAccount`),
  ADD UNIQUE KEY `UK_s5mbhoiavuhi1e69lds055h2x` (`profile`);

--
-- Indexes for table `employerprofile`
--
ALTER TABLE `employerprofile`
  ADD PRIMARY KEY (`profile_id`);

--
-- Indexes for table `experience`
--
ALTER TABLE `experience`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_90vm32g68a7gyxv1ip7iujgko` (`Account_id`);

--
-- Indexes for table `experience_technologies`
--
ALTER TABLE `experience_technologies`
  ADD PRIMARY KEY (`experiance_id`,`Skill_id`),
  ADD KEY `FK_t2qpl3f3vhg784owmi95ap6hf` (`Skill_id`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_fhvwnr3wcy7g925tdljwjqx38` (`offer`),
  ADD KEY `FK_ppxpde9aaa04jlkvs7ot1vyf1` (`profile_id`);

--
-- Indexes for table `freelancer`
--
ALTER TABLE `freelancer`
  ADD PRIMARY KEY (`ConsumerAccount`),
  ADD UNIQUE KEY `UK_2gvr71rlt5hcntu6jr8m2ak38` (`profile`);

--
-- Indexes for table `freelancerprofile`
--
ALTER TABLE `freelancerprofile`
  ADD PRIMARY KEY (`Profile_id`);

--
-- Indexes for table `freelancer_skills`
--
ALTER TABLE `freelancer_skills`
  ADD PRIMARY KEY (`account_id`,`Skill_id`),
  ADD KEY `FK_ajidodk15qb77k43b4l1ymreo` (`Skill_id`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_pbibk0dikldo32nx7ry4fr6ym` (`offer`);

--
-- Indexes for table `offer`
--
ALTER TABLE `offer`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_rd25wdc212jm3ea8g1m1ky1wx` (`counter`),
  ADD KEY `FK_c0dir6acqma1ee1b63jef2621` (`owner`),
  ADD KEY `FK_4hqfxkop0qocenqk0dwuopbc` (`task`);

--
-- Indexes for table `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_2a1vpp7ph76arn5r82mgay4k0` (`rate`);

--
-- Indexes for table `rate`
--
ALTER TABLE `rate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `root`
--
ALTER TABLE `root`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skill`
--
ALTER TABLE `skill`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `statistics`
--
ALTER TABLE `statistics`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_s5a3ogu6vw5q1ned77x7n8b7e` (`employer`);

--
-- Indexes for table `task_technologies`
--
ALTER TABLE `task_technologies`
  ADD PRIMARY KEY (`task_id`,`Skill_id`),
  ADD KEY `FK_7jfc8667po7hxgbq4maogt2gh` (`Skill_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `accnotification`
--
ALTER TABLE `accnotification`
  ADD CONSTRAINT `FK_2ktcnlkox8v1sh0djd47fekag` FOREIGN KEY (`FromAccount_id`) REFERENCES `accounts` (`id`),
  ADD CONSTRAINT `FK_djbtnhgwaabfqihmbgkbfbsxr` FOREIGN KEY (`ToAccount_id`) REFERENCES `consumeraccount` (`Account_id`);

--
-- Constraints for table `adminaccount`
--
ALTER TABLE `adminaccount`
  ADD CONSTRAINT `FK_ayottm3gi1c3xx9cj4kldq85t` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`id`);

--
-- Constraints for table `complaints`
--
ALTER TABLE `complaints`
  ADD CONSTRAINT `FK_q9ugoqrt3n4mr1rhyovg6k9r5` FOREIGN KEY (`owner`) REFERENCES `consumeraccount` (`Account_id`);

--
-- Constraints for table `complaints_replies`
--
ALTER TABLE `complaints_replies`
  ADD CONSTRAINT `FK_lngprkd4ceois79x7xdvy4kna` FOREIGN KEY (`Complain_Id`) REFERENCES `complaints` (`id`),
  ADD CONSTRAINT `FK_mke71tm587egkl75jm28wemd7` FOREIGN KEY (`Replay_Id`) REFERENCES `complaints` (`id`);

--
-- Constraints for table `consumeraccount`
--
ALTER TABLE `consumeraccount`
  ADD CONSTRAINT `FK_c197gw3kx98ab2akmojqrg0kv` FOREIGN KEY (`Account_id`) REFERENCES `accounts` (`id`);

--
-- Constraints for table `employer`
--
ALTER TABLE `employer`
  ADD CONSTRAINT `FK_s5mbhoiavuhi1e69lds055h2x` FOREIGN KEY (`profile`) REFERENCES `employerprofile` (`profile_id`),
  ADD CONSTRAINT `FK_tiwqort3fopxp3o3wrjvge6p6` FOREIGN KEY (`ConsumerAccount`) REFERENCES `consumeraccount` (`Account_id`);

--
-- Constraints for table `employerprofile`
--
ALTER TABLE `employerprofile`
  ADD CONSTRAINT `FK_7yavaut2whnrm10yp2eppb3ws` FOREIGN KEY (`profile_id`) REFERENCES `profile` (`id`);

--
-- Constraints for table `experience`
--
ALTER TABLE `experience`
  ADD CONSTRAINT `FK_90vm32g68a7gyxv1ip7iujgko` FOREIGN KEY (`Account_id`) REFERENCES `freelancer` (`ConsumerAccount`);

--
-- Constraints for table `experience_technologies`
--
ALTER TABLE `experience_technologies`
  ADD CONSTRAINT `FK_r4sx8j10b2dlv27rlev9jruxm` FOREIGN KEY (`experiance_id`) REFERENCES `experience` (`id`),
  ADD CONSTRAINT `FK_t2qpl3f3vhg784owmi95ap6hf` FOREIGN KEY (`Skill_id`) REFERENCES `skill` (`id`);

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `FK_fhvwnr3wcy7g925tdljwjqx38` FOREIGN KEY (`offer`) REFERENCES `offer` (`id`),
  ADD CONSTRAINT `FK_ppxpde9aaa04jlkvs7ot1vyf1` FOREIGN KEY (`profile_id`) REFERENCES `freelancerprofile` (`Profile_id`);

--
-- Constraints for table `freelancer`
--
ALTER TABLE `freelancer`
  ADD CONSTRAINT `FK_2gvr71rlt5hcntu6jr8m2ak38` FOREIGN KEY (`profile`) REFERENCES `freelancerprofile` (`Profile_id`),
  ADD CONSTRAINT `FK_p0co79e7vc1h22ucarm0eysbo` FOREIGN KEY (`ConsumerAccount`) REFERENCES `consumeraccount` (`Account_id`);

--
-- Constraints for table `freelancerprofile`
--
ALTER TABLE `freelancerprofile`
  ADD CONSTRAINT `FK_fifqrqy1ayd8yllu1o4kexqtg` FOREIGN KEY (`Profile_id`) REFERENCES `profile` (`id`);

--
-- Constraints for table `freelancer_skills`
--
ALTER TABLE `freelancer_skills`
  ADD CONSTRAINT `FK_8o1lx528ihnwrvld38vddjn4c` FOREIGN KEY (`account_id`) REFERENCES `freelancer` (`ConsumerAccount`),
  ADD CONSTRAINT `FK_ajidodk15qb77k43b4l1ymreo` FOREIGN KEY (`Skill_id`) REFERENCES `skill` (`id`);

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `FK_pbibk0dikldo32nx7ry4fr6ym` FOREIGN KEY (`offer`) REFERENCES `offer` (`id`);

--
-- Constraints for table `offer`
--
ALTER TABLE `offer`
  ADD CONSTRAINT `FK_4hqfxkop0qocenqk0dwuopbc` FOREIGN KEY (`task`) REFERENCES `task` (`id`),
  ADD CONSTRAINT `FK_c0dir6acqma1ee1b63jef2621` FOREIGN KEY (`owner`) REFERENCES `freelancer` (`ConsumerAccount`),
  ADD CONSTRAINT `FK_rd25wdc212jm3ea8g1m1ky1wx` FOREIGN KEY (`counter`) REFERENCES `counter` (`id`);

--
-- Constraints for table `profile`
--
ALTER TABLE `profile`
  ADD CONSTRAINT `FK_2a1vpp7ph76arn5r82mgay4k0` FOREIGN KEY (`rate`) REFERENCES `rate` (`id`);

--
-- Constraints for table `task`
--
ALTER TABLE `task`
  ADD CONSTRAINT `FK_s5a3ogu6vw5q1ned77x7n8b7e` FOREIGN KEY (`employer`) REFERENCES `employer` (`ConsumerAccount`);

--
-- Constraints for table `task_technologies`
--
ALTER TABLE `task_technologies`
  ADD CONSTRAINT `FK_7jfc8667po7hxgbq4maogt2gh` FOREIGN KEY (`Skill_id`) REFERENCES `skill` (`id`),
  ADD CONSTRAINT `FK_slogfv8seeja9f01suw2w1khf` FOREIGN KEY (`task_id`) REFERENCES `task` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
