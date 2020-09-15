package EnumState;

public enum LeaveRequestState {
    Submitted {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("EMP - Starting the Leave Request and submitting to Team Leader.");
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
            System.out.println("TL - Reviewing the Leave Request and escalating to Department Manager.");
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
            System.out.println("DM - Approving the Leave Request.");
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
