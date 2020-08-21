package com.xyzcorp.strategy;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StrategyTest {
    public class Artist {
        private String firstName;
        private String lastName;
        private String alias;

        public Artist(String firstName, String lastName, String alias) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.alias = alias;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAlias() {
            return alias;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Artist artist = (Artist) o;
            return Objects.equals(firstName, artist.firstName) &&
                    Objects.equals(lastName, artist.lastName) &&
                    Objects.equals(alias, artist.alias);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, alias);
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Artist{");
            sb.append("firstName='").append(firstName).append('\'');
            sb.append(", lastName='").append(lastName).append('\'');
            sb.append(", alias='").append(alias).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }


    @Test
    public void testSortLastNameStrategyUsingCollectionsSort() {
        //This kind of list can be used with Collections.sort
        var list = new ArrayList<Artist>();
        list.add(new Artist("Jimmy", "Page", null));
        list.add(new Artist("Roger", "Waters", null));
        list.add(new Artist("Dave", "Gahan", null));
        list.add(new Artist("Siouxie", "Sioux", null));

        list.sort(new Comparator<>() {
            @Override
            public int compare(Artist o1, Artist o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        System.out.println(list);
    }


    @Test
    public void testSortLastNameStrategyUsingStreamSort() {

        var artists = Arrays.asList(
                new Artist("Billy", "Idol", null),
                new Artist("Louis", "Armstrong", "Satchmo"),
                new Artist("Paul",  "Hewson", "Bono"),
                new Artist("Cherilyn", "Sarkisian", "Cher"),
                new Artist("Stefani", "Germanotta", "Lady Gaga"),
                new Artist("Lata", "Mangeshkar", null),
                new Artist("Zhang", "Liangying", null)
        );


        List<Artist> resultArtists = artists
                .stream()
                .sorted(Comparator.comparing(Artist::getLastName))
                .collect(Collectors.toList());

        System.out.println(resultArtists);
    }
}
