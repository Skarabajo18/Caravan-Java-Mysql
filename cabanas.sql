-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-11-2018 a las 19:15:25
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdcentro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cabanas`
--

CREATE TABLE `cabanas` (
  `numeroDeCabaña` varchar(5) NOT NULL,
  `cantidadDeCamas` int(11) NOT NULL,
  `CantidadDeDias` int(11) NOT NULL,
  `todoIncluido` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cabanas`
--

INSERT INTO `cabanas` (`numeroDeCabaña`, `cantidadDeCamas`, `CantidadDeDias`, `todoIncluido`) VALUES
('1212', 51, 0, 1),
('123', 52, 0, 1),
('1234', 51, 0, 1),
('1237', 52, 0, 1),
('5009', 52, 0, 1),
('asdap', 50, 0, 1),
('fe', 51, 0, 1),
('feli', 51, 0, 1),
('felip', 50, 0, 1),
('q', 49, 0, 1),
('qwe', 50, 0, 1),
('qwer', 51, 0, 1),
('qwewr', 49, 0, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cabanas`
--
ALTER TABLE `cabanas`
  ADD PRIMARY KEY (`numeroDeCabaña`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
