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
-- Table structure for table `SALESLIST`
--

DROP TABLE IF EXISTS `SALESLIST`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SALESLIST` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `PRODUCTNAME` varchar(250) NOT NULL,
  `QTY` varchar(250) NOT NULL,
  `FREE` varchar(250) NOT NULL,
  `MRP` int NOT NULL,
  `DISCOUNT` int NOT NULL,
  `TOTAL` varchar(250) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SALESLIST`
--

LOCK TABLES `SALESLIST` WRITE;
/*!40000 ALTER TABLE `SALESLIST` DISABLE KEYS */;
INSERT INTO `SALESLIST` VALUES (1,'tea','546','fdg',345,45,'103604.0'),(2,'tea','546','fdg',345,45,'103604.0'),(3,'coffie','45','h',34,34,'1010.0'),(4,'coffie','45','h',34,34,'1010.0'),(5,'coffie','45','h',34,34,'1010.0'),(6,'coffie','45','h',34,34,'1010.0'),(7,'vbgy','5','ffg',67,4,'322.0'),(8,'vbgygjbb','5','ffg',676,4,'3245.0'),(9,'tea','2','gdgh',45,30,'63.0'),(10,'cgnfgnb','28','gdgh',457,30,'8958.0'),(11,'coffie','54','nai deta',56,12,'2662.0'),(12,'tea','54','nai deta1',560,50,'15120.0'),(13,'fdh','45','dg',565,50,'12713.0'),(14,'fdhfdh','45','dg',565324,50,'1.271979E7'),(15,'xsc','34','sv',34,34,'763.0'),(16,'tea','34','sv',342,20,'9303.0'),(17,'tea','34','sv',342,20,'9303.0'),(18,'tea','34','sv',342,20,'9303.0'),(19,'tea','34','sv',342,20,'9303.0'),(20,'tea','34','sv',342,20,'9303.0'),(21,'tea','34','sv',342,20,'9303.0'),(22,'tea','34','sv',342,20,'9303.0'),(23,'tea','34','sv',342,20,'9303.0'),(24,'tea','34','sv',342,20,'9303.0'),(25,'maggie','5','chal nikal',45,10,'203.0'),(26,'tea','50','chal nikal1',456,50,'11400.0'),(27,'trimer','2','g',456,2,'894.0'),(28,'trimer','2','g',456,2,'894.0'),(29,'trimer','2','g',456,2,'894.0'),(30,'trimer','2','g',456,2,'894.0'),(31,'coffie','12','no',100,5,'1140.0'),(32,'tea','120','no',50,5,'5700.0'),(33,'bdf','45','fgd',45,5,'1924.0'),(34,'bdf','45','fgd',45,5,'1924.0'),(35,'bdf','45','fgd',45,5,'1924.0'),(36,'bdf','45','fgd',45,5,'1924.0'),(37,'bdf','45','fgd',45,5,'1924.0'),(38,'bdf','45','fgd',45,5,'1924.0'),(39,'bdf','45','fgd',45,5,'1924.0'),(40,'bdf','45','fgd',45,5,'1924.0'),(41,'bdf','45','fgd',45,5,'1924.0'),(42,'cofie','3','chal be',56,2,'165.0'),(43,'cofie','3','chal be',56,2,'165.0'),(44,'cofie','3','chal be',56,2,'165.0'),(45,'cofie','3','chal be',56,2,'165.0'),(46,'coffie','87','hh',677,60,'23560.0'),(47,'qwwe','4','no',34,5,'130.0'),(48,'qwwe','4','no',34,5,'130.0'),(49,'qwwe','4','no',34,5,'130.0'),(50,'qwwe','4','no',34,5,'130.0'),(51,'qwwe','4','no',34,5,'130.0'),(52,'qwwe','4','no',34,5,'130.0'),(53,'coffie','6','no',45,2,'265.0'),(54,'tea','6','no',845,2,'4969.0'),(55,'dfhd','34','cxvb',234,56,'3501.0'),(56,'dfhd','34','cxvb',234,56,'3501.0'),(57,'dfhd','34','cxvb',234,56,'3501.0'),(58,'coffie','4','sd',233,4,'895.0'),(59,'coffie','4','sd',233,4,'895.0'),(60,'coffie','4','sd',233,4,'895.0');
/*!40000 ALTER TABLE `SALESLIST` ENABLE KEYS */;
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
