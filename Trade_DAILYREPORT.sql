-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: Trade
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `DAILYREPORT`
--

DROP TABLE IF EXISTS `DAILYREPORT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `DAILYREPORT` (
  `PRODUCTNAME` varchar(200) NOT NULL,
  `QTY` varchar(200) NOT NULL,
  `AMOUNT` varchar(200) NOT NULL,
  `DATE` varchar(200) NOT NULL,
  `ID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DAILYREPORT`
--

LOCK TABLES `DAILYREPORT` WRITE;
/*!40000 ALTER TABLE `DAILYREPORT` DISABLE KEYS */;
INSERT INTO `DAILYREPORT` VALUES ('coffie','3','753.0','11/11/20',1),('TEA','435','6250572.0','11/12/20',2),('TEA','3','99.0','11/12/20',3),('TEA','3','1002.0','11/12/20',4),('TEA','34','11261.0','11/12/20',5),('TEA','34','11261.0','11/12/20',6),('yahtea','34','667.0','11/12/20',7),('yahtea','34','667.0','11/12/20',8),('fdgdf','56','2394.0','11/30/20',9),('dfg','54','28305.0','11/30/20',10),('dfg','54','28305.0','11/30/20',11),('fdg','4','1202.0','11/30/20',12),('fdgdf','4','99.0','11/30/20',13),('fdgdf','4','99.0','11/30/20',14),('ghffg','56','1725.0','11/30/20',15),('ghffg','56','1725.0','11/30/20',16),('dfgdf','4','957.0','11/30/20',17),('dfgdf','4','957.0','11/30/20',18),('SDFDS','45','1114.0','11/30/20',19),('SDFDS','45','1114.0','11/30/20',20),('FDGFH','4','213.0','11/30/20',21),('FDGFH','4','213.0','11/30/20',22),('tea','546','103604.0','12/6/20',23),('tea','546','103604.0','12/6/20',24),('coffie','45','1010.0','12/6/20',25),('coffie','45','1010.0','12/6/20',26),('coffie','45','1010.0','12/6/20',27),('coffie','45','1010.0','12/6/20',28),('vbgy','5','322.0','12/9/20',29),('vbgygjbb','5','3245.0','12/9/20',30),('tea','2','63.0','12/10/20',31),('cgnfgnb','28','8958.0','12/10/20',32),('coffie','54','2662.0','12/14/20',33),('tea','54','15120.0','12/14/20',34),('fdh','45','12713.0','12/19/20',35),('fdhfdh','45','1.271979E7','12/19/20',36),('xsc','34','763.0','12/20/20',37),('tea','34','9303.0','12/20/20',38),('tea','34','9303.0','12/20/20',39),('tea','34','9303.0','12/20/20',40),('tea','34','9303.0','12/20/20',41),('tea','34','9303.0','12/20/20',42),('tea','34','9303.0','12/20/20',43),('tea','34','9303.0','12/20/20',44),('tea','34','9303.0','12/20/20',45),('tea','34','9303.0','12/20/20',46),('maggie','5','203.0','12/24/20',47),('tea','50','11400.0','12/24/20',48),('trimer','2','894.0','12/24/20',49),('trimer','2','894.0','12/24/20',50),('trimer','2','894.0','12/24/20',51),('trimer','2','894.0','12/24/20',52),('coffie','12','1140.0','1/9/21',53),('tea','120','5700.0','1/9/21',54),('bdf','45','1924.0','1/9/21',55),('bdf','45','1924.0','1/9/21',56),('bdf','45','1924.0','1/9/21',57),('bdf','45','1924.0','1/9/21',58),('bdf','45','1924.0','1/9/21',59),('bdf','45','1924.0','1/9/21',60),('bdf','45','1924.0','1/9/21',61),('bdf','45','1924.0','1/9/21',62),('bdf','45','1924.0','1/9/21',63),('cofie','3','165.0','1/20/21',64),('cofie','3','165.0','1/20/21',65),('cofie','3','165.0','1/20/21',66),('cofie','3','165.0','1/20/21',67),('coffie','87','23560.0','1/25/21',68),('qwwe','4','130.0','2/23/21',69),('qwwe','4','130.0','2/23/21',70),('qwwe','4','130.0','2/23/21',71),('qwwe','4','130.0','2/23/21',72),('qwwe','4','130.0','2/23/21',73),('qwwe','4','130.0','2/23/21',74),('coffie','6','265.0','3/1/21',75),('tea','6','4969.0','3/1/21',76),('dfhd','34','3501.0','3/1/21',77),('dfhd','34','3501.0','3/1/21',78),('dfhd','34','3501.0','3/1/21',79),('coffie','4','895.0','3/27/21',80),('coffie','4','895.0','3/27/21',81),('coffie','4','895.0','3/27/21',82);
/*!40000 ALTER TABLE `DAILYREPORT` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-21 18:54:21
