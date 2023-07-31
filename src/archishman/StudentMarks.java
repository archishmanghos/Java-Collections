package archishman;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks> {
    private int mathematics, physics;

    public StudentMarks(int mathematics, int physics) {
        this.mathematics = mathematics;
        this.physics = physics;
    }

    public int getMathematics() {
        return mathematics;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "mathematics=" + mathematics +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {
        // return (this.mathematics < o.mathematics ? -1 : this.mathematics > o.mathematics ? 1 : 0);
        // same as above but shorter
        // return this.mathematics - o.mathematics; -> ascending
        return o.mathematics - this.mathematics; // -> descending
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMarks that = (StudentMarks) o;
        return mathematics == that.mathematics && physics == that.physics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mathematics, physics);
    }
}
