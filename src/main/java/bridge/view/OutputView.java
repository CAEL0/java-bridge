package bridge.view;

import bridge.constant.ViewConstants;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public void printStartingGame() {
        System.out.println(ViewConstants.STARTING_GAME);
        System.out.println();
    }

    public void printAskingBridgeLength() {
        System.out.println(ViewConstants.ASKING_BRIDGE_LENGTH);
    }

    public void printAskingNextMove() {
        System.out.println(ViewConstants.ASKING_NEXT_MOVE);
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap() {
    }

    public void printAskingRestartingGame() {
        System.out.println(ViewConstants.ASKING_RESTARTING_GAME);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }

    public void printGameResult() {
        System.out.println(ViewConstants.GAME_RESULT);
    }

    public void printSuccessOrFailure(String result) {
        System.out.printf(ViewConstants.SUCCESS_OR_FAILURE, result);
        System.out.println();
    }
}
