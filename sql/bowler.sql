-- MySQL dump 10.13  Distrib 5.7.29, for osx10.15 (x86_64)
--
-- Host: localhost    Database: bowler
-- ------------------------------------------------------
-- Server version	5.7.29

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
-- Current Database: `bowler`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `bowler` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bowler`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `address_type` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `line1` varchar(255) DEFAULT NULL,
  `line2` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `receipient_address_fk` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtlgemcmsgtvh6i112ldiiup30` (`receipient_address_fk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (3,'billing','','','','','',2),(4,'delivery','','','','','',2),(11,'billing','','','','','',10),(12,'delivery','','','','','',10),(17,'billing','','','','','',16),(18,'delivery','','','','','',16),(21,'billing','','','','','',20),(22,'delivery','','','','','',20),(27,'billing','','','','','',26),(28,'delivery','','','','','',26),(35,'billing','','','','','',34),(36,'delivery','','','','','',34),(41,'billing','','','','','',40),(42,'delivery','','','','','',40);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (43),(43),(43),(43);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_request`
--

DROP TABLE IF EXISTS `order_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_request` (
  `order_id` varchar(255) NOT NULL,
  `order_receipient_fk` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FK8fn6fjviuys2fugwnesdr6h0y` (`order_receipient_fk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_request`
--

LOCK TABLES `order_request` WRITE;
/*!40000 ALTER TABLE `order_request` DISABLE KEYS */;
INSERT INTO `order_request` VALUES ('adfafdafafdasfas',16),('asdasdg',20),('asdaasdg',40);
/*!40000 ALTER TABLE `order_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` bigint(20) DEFAULT NULL,
  `order_product_fk` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKonmxkfw69tofhx9xuhgxqu8od` (`order_product_fk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (5,'abc',1010,NULL),(6,'abc1',10101,NULL),(7,'abc',1010,NULL),(8,'abc1',10101,NULL),(13,'abc',1010,'adfafdafafdasfas'),(14,'abc1',10101,'adfafdafafdasfas'),(23,'abc',1010,'asdasdg'),(24,'abc1',10101,'asdasdg'),(29,'abc',1010,NULL),(30,'abc1',10101,NULL),(37,'abc',1010,'asdaasdg'),(31,'abc',1010,NULL),(32,'abc1',10101,NULL),(38,'abc1',10101,'asdaasdg');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profile`
--

DROP TABLE IF EXISTS `profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profile`
--

LOCK TABLES `profile` WRITE;
/*!40000 ALTER TABLE `profile` DISABLE KEYS */;
INSERT INTO `profile` VALUES (1,'','',''),(9,'','',''),(15,'','',''),(19,'','',''),(25,'','',''),(33,'','',''),(39,'','','');
/*!40000 ALTER TABLE `profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipient`
--

DROP TABLE IF EXISTS `receipient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receipient` (
  `id` int(11) NOT NULL,
  `receipient_profile_fk` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5tmk1f8vml1kmh5fd9tsuv8su` (`receipient_profile_fk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receipient`
--

LOCK TABLES `receipient` WRITE;
/*!40000 ALTER TABLE `receipient` DISABLE KEYS */;
INSERT INTO `receipient` VALUES (2,1),(10,9),(16,15),(20,19),(26,25),(34,33),(40,39);
/*!40000 ALTER TABLE `receipient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-22 14:44:49
