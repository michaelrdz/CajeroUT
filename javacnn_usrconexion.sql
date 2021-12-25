-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: javacnn
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `usrconexion`
--

DROP TABLE IF EXISTS `usrconexion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usrconexion` (
  `id` int(11) NOT NULL,
  `nombre` varchar(90) NOT NULL,
  `rol` int(11) NOT NULL,
  `calif` varchar(90) DEFAULT NULL,
  `horario` varchar(90) DEFAULT NULL,
  `pass` int(11) NOT NULL,
  `edoCuenta` varchar(90) DEFAULT NULL,
  `CreditoUT` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usrconexion`
--

LOCK TABLES `usrconexion` WRITE;
/*!40000 ALTER TABLE `usrconexion` DISABLE KEYS */;
INSERT INTO `usrconexion` VALUES (5678,'Christina Rodríguez',1,'','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,NULL,NULL),(9123,'Gerardo Orduña',1,NULL,'http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,NULL,NULL),(140854,'Andrés Reyes',2,'src/Documentos/califEmanuel.pdf','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,'src/Documentos/edoCuentaEmanuel.pdf',35),(151447,'José Terán',2,'src/Documentos/califTeran.pdf','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,'src/Documentos/edoCuentaTeran.pdf',190),(162016,'Salvador Castillo',2,'src/Documentos/califSalvador.pdf','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,'src/Documentos/edoCuentaSalvador.pdf',0),(170541,'Alejandro Salas',2,'src/Documentos/califAlejandro.pdf','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,'src/Documentos/edoCuentaAlejandro.pdf',0),(170785,'Karen Rodríguez',2,'src/Documentos/califKaren.pdf','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,'src/Documentos/edoCuentaKaren.pdf',250),(170818,'Miguel Esparza',2,'src/Documentos/califMiguel.pdf','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,'src/Documentos/edoCuentaMiguel.pdf',140),(171578,'Luis Alberto',2,'src/Documentos/califLuisAlberto.pdf','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,'src/Documentos/edoCuentaLuisAlberto.pdf',100),(171679,'Michael Rodríguez',2,'src/Documentos/califMichael.pdf','http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf',1234,'src/Documentos/edoCuentaMichael.pdf',1300);
/*!40000 ALTER TABLE `usrconexion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-18 11:51:55
