package music.player

import grails.gorm.services.Service

@Service(Playlist)
interface PlaylistService {

    Playlist save(String name, Song song)
}
