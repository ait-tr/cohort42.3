package album.dao;

import classwork_37.album.dao.Album;
import classwork_37.album.dao.AlbumImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import classwork_37.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    Photo[] ph;
    LocalDateTime now = LocalDateTime.now();// catch current day and time

    @BeforeEach
    void setUp() {

        album = new AlbumImpl(7);

        ph = new Photo[6];
        ph[0] = new Photo(1, 1,"t1", "url1", now.minusDays(2)); // newest photo
        ph[1] = new Photo(1, 2,"t2", "url2", now.minusDays(3));
        ph[2] = new Photo(1, 3,"t3", "url3", now.minusDays(5));
        ph[3] = new Photo(2, 1,"t1", "url4", now.minusDays(7));
        ph[4] = new Photo(2, 2,"t2", "url5", now.minusDays(7));
        ph[5] = new Photo(2, 3,"t3", "url6", now.minusDays(7)); // oldest photos

        // put photos into album

//        for (int i = 0; i < ph.length; i++) {
//            album.addPhoto(ph[i]);
//        }

        for (Photo p : ph) {
            album.addPhoto(p);
        }

    }

    @Test
    void addPhotoTest() {
        // can't add null
        assertFalse(album.addPhoto(null));
        // can't add existed photo
        assertFalse(album.addPhoto(ph[1]));
        // can add some new photo
        Photo photo = new Photo(3,1,"t", "url", now);
        assertTrue(album.addPhoto(photo));
        // check size
        assertEquals(7, album.size());
        // can't add more than capacity
        photo = new Photo(3,2,"t", "url", now);
        assertFalse(album.addPhoto(photo));
    }

    @Test
    void removePhotoTest() {
        // remove existed photo
        assertTrue(album.removePhoto(3, 1)); // remove existed ph[2]
        // remove absent photo
        assertFalse(album.removePhoto(5, 1)); // remove absent photo
        // check size
        assertEquals(5, album.size());
        // find removed photo
        assertNull(album.getPhotoFromAlbum(3, 1));

    }

    @Test
    void updatePhotoTest() {
        assertTrue(album.updatePhoto(1, 1, "newUrl"));// update url
        assertEquals("newUrl", album.getPhotoFromAlbum(1,1).getUrl());// check url
    }

    @Test
    void getPhotoFromAlbumTest() {
        assertEquals(ph[0], album.getPhotoFromAlbum(1,1)); // find existed photo
        assertNull(album.getPhotoFromAlbum(1,3)); // find absent photo
    }

    @Test
    void getAllPhotoFromAlbumTest() {
        Photo[] expected = {ph[3], ph[4], ph[5]}; //
        Photo[] actual = album.getAllPhotosFromAlbum(2); // albumId = 2
        Arrays.sort(actual); // sort array in native order (first - albumId, then - photoId)
        assertArrayEquals( expected, actual);
    }

    @Test
    void getPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate(); // take only date, cut time
        Photo[] actual = album.getPhotoBetweenDates(ld.minusDays(6), ld.minusDays(1));
        Arrays.sort(actual); // sort array in native order (first - albumId, then photoId)
        Photo[] expected = {ph[0], ph[1], ph[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sizeTest() {
        assertEquals(6, album.size());
    }
}