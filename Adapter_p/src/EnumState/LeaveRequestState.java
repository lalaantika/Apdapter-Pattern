package EnumState;

public enum LeaveRequestState {
    Submitted {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("EMP - Starts the Leave Request and submits to Team Leader.");
            return Escalated;
        }

        @Override
        public String responsiblePerson() {
            return "Employee";
        }
    },
    Escalated {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("TL - Reviews the Leave Request and escalates to Department Manager.");
            return Approved;
        }

        @Override
        public String responsiblePerson() {
            return "Team Leader";
        }
    },
    Approved {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("DM - Approves the Leave Request.");
            return this;
        }

        @Override
        public String responsiblePerson() {
            return "Department Manager";
        }
    };

    public abstract LeaveRequestState nextState();
    public abstract String responsiblePerson();
}
