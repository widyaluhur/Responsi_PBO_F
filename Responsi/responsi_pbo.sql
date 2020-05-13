-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Bulan Mei 2020 pada 09.25
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `gajik`
--

CREATE TABLE `gajik` (
  `Idkaryawan` int(11) NOT NULL,
  `Nama` varchar(40) NOT NULL,
  `Posisi` varchar(20) NOT NULL,
  `Alamat` varchar(40) NOT NULL,
  `Nohp` int(11) NOT NULL,
  `Gajipokok` int(11) NOT NULL,
  `Jamlembur` int(11) NOT NULL,
  `Tunjangan` int(11) NOT NULL,
  `Pajak` int(11) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `gajik`
--

INSERT INTO `gajik` (`Idkaryawan`, `Nama`, `Posisi`, `Alamat`, `Nohp`, `Gajipokok`, `Jamlembur`, `Tunjangan`, `Pajak`, `Total`) VALUES
(1, 'uhuy', 'marketing', 'bausasran', 7807564, 2500000, 50, 75000, 25000, 2550000),
(2, 'luluk', 'Programmer', 'yogya', 83439221, 3000000, 40, 60000, 30000, 3030000),
(4, 'halo', 'Supervisor', 'kota jogja', 83932, 2000000, 50, 75000, 20000, 2055000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `Idkaryawana` int(11) NOT NULL,
  `Namaa` varchar(40) NOT NULL,
  `Posisia` varchar(40) NOT NULL,
  `Alamata` varchar(20) NOT NULL,
  `Nohpa` int(11) NOT NULL,
  `Totala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`Idkaryawana`, `Namaa`, `Posisia`, `Alamata`, `Nohpa`, `Totala`) VALUES
(1, 'Widya Luhur W', 'Direktur', 'Kota Yogyakarta', 812345678, 10000000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `gajik`
--
ALTER TABLE `gajik`
  ADD PRIMARY KEY (`Idkaryawan`);

--
-- Indeks untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`Idkaryawana`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `gajik`
--
ALTER TABLE `gajik`
  MODIFY `Idkaryawan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- AUTO_INCREMENT untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `Idkaryawana` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
