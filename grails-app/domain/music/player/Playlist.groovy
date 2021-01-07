package music.player

class Playlist {

	String name
	static hasMany = [songs: Song]


    static constraints = {
    	name blank: false
    }

    String toString() {
        name
    }
}
