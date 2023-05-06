package iterator.dinermerger

import iterator.dinermerger.MenuItem

interface Iterator {
    fun hasNext(): Boolean
    fun next(): MenuItem?
}