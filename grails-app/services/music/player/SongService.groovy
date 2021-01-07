package music.player

// import grails.gorm.transactions.Transactional

// @Transactional
import grails.gorm.services.Service

@Service(Song)
interface SongService {

    Song save(String title)
}
