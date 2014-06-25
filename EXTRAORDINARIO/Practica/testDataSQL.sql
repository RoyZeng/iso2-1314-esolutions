-- --------------------------------------------------------
-- Host:                         db4free.net
-- Versión del servidor:         5.6.19 - MySQL Community Server (GPL)
-- SO del servidor:              linux-glibc2.5
-- HeidiSQL Versión:             8.1.0.4545
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para mercadonatest
CREATE DATABASE IF NOT EXISTS `mercadonatest` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mercadonatest`;


-- Volcando estructura para tabla mercadonatest.Producto
CREATE TABLE IF NOT EXISTS `Producto` (
  `Id` char(50) NOT NULL,
  `nombre` char(50) DEFAULT NULL,
  `cantidad` char(50) DEFAULT NULL,
  `tipo` char(50) DEFAULT NULL,
  `fecha` char(50) DEFAULT NULL,
  KEY `Id` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla mercadonatest.Producto: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `Producto` DISABLE KEYS */;
INSERT INTO `Producto` (`Id`, `nombre`, `cantidad`, `tipo`, `fecha`) VALUES
	('0', 'pepinillos', '100', 'encurtios', '25/07/2014'),
	('1', 'nombre', '1', 'tipo', 'fecha'),
	('2', 'nombre', '1', 'tipo', 'fecha'),
	('99', 'nombre', '1', 'tipo', 'fecha'),
	('50', 'test', '2000', 'test', 'test'),
	('99', 'nombre', '1', 'tipo', 'fecha');
/*!40000 ALTER TABLE `Producto` ENABLE KEYS */;


-- Volcando estructura para tabla mercadonatest.test
CREATE TABLE IF NOT EXISTS `test` (
  `test` char(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla mercadonatest.test: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` (`test`) VALUES
	('9999');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;


-- Volcando estructura para tabla mercadonatest.Usuarios
CREATE TABLE IF NOT EXISTS `Usuarios` (
  `DNI` char(50) DEFAULT NULL,
  `Nombre` char(50) DEFAULT NULL,
  `Apellido1` char(50) DEFAULT NULL,
  `Apellido2` char(50) DEFAULT NULL,
  `Password` char(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla mercadonatest.Usuarios: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `Usuarios` DISABLE KEYS */;
INSERT INTO `Usuarios` (`DNI`, `Nombre`, `Apellido1`, `Apellido2`, `Password`) VALUES
	('05713540', 'david', 'm', 'g', '9999');
/*!40000 ALTER TABLE `Usuarios` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
