package EnumState;

public class EnumDemo {
    public static void main(String[] args) {
        LeaveRequestState state = LeaveRequestState.Submitted;

        state = state.nextState();
        assertEquals(LeaveRequestState.Escalated, state);

        state = state.nextState();
        assertEquals(LeaveRequestState.Approved, state);

        state = state.nextState();
        assertEquals(LeaveRequestState.Approved, state);
    }

    private static void assertEquals(LeaveRequestState approved, LeaveRequestState state) {
    }
}
