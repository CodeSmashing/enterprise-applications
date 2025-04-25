package com.ehb.enterpriseapps;

import java.util.ArrayList;
import java.util.Iterator;

public class SnackController implements Iterable<Snack> {
	private static SnackController instance;
	private ArrayList<Snack> snacks;

	private SnackController() {
		snacks = new ArrayList<>();
	}

	public static SnackController getInstance() {
        if (instance == null) {
            instance = new SnackController();
        }
		return instance;
	}

	public void addSnack(Snack snack) {
		snacks.add(snack);
	}

	public void removeSnack(Snack snack) {
		snacks.remove(snack);
	}

	public ArrayList<Snack> getSnackList() {
		return snacks;
	}

	public void setSnackList(ArrayList<Snack> snacks) {
		this.snacks = snacks;
	}

	public void clearSnacks() {
		snacks.clear();
	}

	@Override
    public Iterator<Snack> iterator() {
        return snacks.iterator();
    }
}
