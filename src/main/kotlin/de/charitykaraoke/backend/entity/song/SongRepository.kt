package de.charitykaraoke.backend.entity.song

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface SongRepository : JpaRepository<Song, Int> {

}