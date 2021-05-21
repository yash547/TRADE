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
-- Table structure for table `SALES`
--

DROP TABLE IF EXISTS `SALES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SALES` (
  `CUSID` int NOT NULL,
  `customername` varchar(200) NOT NULL,
  `CUSTOMERPh` varchar(200) NOT NULL,
  `totalqty` varchar(200) NOT NULL,
  `totalitems` varchar(200) NOT NULL,
  `paymode` varchar(200) NOT NULL,
  `balanceamount` varchar(200) NOT NULL,
  `currentamount` varchar(200) NOT NULL,
  `netamount` varchar(200) NOT NULL,
  `DATE` varchar(200) NOT NULL,
  KEY `CUSID` (`CUSID`),
  CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`CUSID`) REFERENCES `CUSTOMERRECORd` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SALES`
--

LOCK TABLES `SALES` WRITE;
/*!40000 ALTER TABLE `SALES` DISABLE KEYS */;
INSERT INTO `SALES` VALUES (2,'k','546456','68.0','2.0','','334.0','1000','1334','11/12/20'),(2,'k','546456','56.0','1.0','','394.0','2000','2394','11/30/20'),(2,'k','546456','56.0','1.0','','394.0','2000','2394','11/30/20'),(2,'k','546456','108.0','2.0','','11044.0','45566','56610','11/30/20'),(2,'k','546456','4.0','1.0','','202.0','1000','1202','11/30/20'),(1,'yash','9604013399','8.0','2.0','','98.0','100','198','11/30/20'),(2,'k','546456','112.0','2.0','','1450.0','2000','3450','11/30/20'),(1,'yash','9604013399','8.0','2.0','','914.0','1000','1914','11/30/20'),(4,'M','435','90.0','2.0','','228.0','2000','2228','11/30/20'),(4,'M','435','90.0','2.0','','228.0','2000','2228','11/30/20'),(4,'M','435','8.0','2.0','','226.0','200','426','11/30/20'),(2,'k','546456','1092.0','2.0','','173875.0','33333','207208','12/6/20'),(4,'m','435','180.0','4.0','udhari','1706.0','2334','4040','12/6/20'),(4,'m','435','10.0','2.0','udhari','567.0','3000','3567','12/9/20'),(6,'y','587578','30.0','2.0','udhari','3589.0','5432','9021','12/10/20'),(7,'vaidehi','34','108.0','2.0','udhari','7782.0','10000','17782','12/14/20'),(8,'p','43','90.0','2.0','','1.2609159E7','123344','12732503','12/19/20'),(8,'p','43','340.0','10.0','udhari','4490.0','80000','84490','12/20/20'),(2,'k','5454','55.0','2.0','','11601.0','2','11603','12/24/20'),(9,'saurabh]','3','8.0','4.0','udhari','576.0','3000','3576','12/24/20'),(12,'ani','12345','24.0','6.0','udhari','380.0','400','780','2/23/21'),(12,'ani','12345','12.0','2.0','udhare','236.0','4998','5234','3/1/21'),(12,'ani','12345','102.0','3.0','udharii1','3710.0','6793','10503','3/1/21'),(12,'ani','12345','12.0','3.0','udhari','685.0','2000','2685','3/27/21');
/*!40000 ALTER TABLE `SALES` ENABLE KEYS */;
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
