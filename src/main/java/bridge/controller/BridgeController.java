package bridge.controller;

import bridge.domain.BridgeGame;
import bridge.view.InputView;
import bridge.view.OutputView;

public class BridgeController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private BridgeGame bridgeGame;

    public void run() {
        init();
    }

    private void init() {
        outputView.printStartingGame();
        outputView.printAskingBridgeLength();
        makeBridge();
        System.out.println();
    }

    private void makeBridge() {
        while (true) {
            try {
                bridgeGame = new BridgeGame(inputView.readBridgeSize());
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void play() {
        do {
            takeTurn();
        } while (bridgeGame.isAlive());
    }

    private void takeTurn() {
        outputView.printAskingMoving();
        move();
        outputView.printMap(bridgeGame.makeMap());
    }

    private void move() {
        while (true) {
            try {
                bridgeGame.move(inputView.readMoving());
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
