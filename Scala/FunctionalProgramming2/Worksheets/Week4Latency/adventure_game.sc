package Week4Latency

object adventure_game {
	trait Adventure{
		def collectCoins(): List[Coin]
		def buyTreasure(coins: List[Coin]): Treasure
	}
	 val adventure = Adventure()
	 val coins = adventure.collectCoins()
	 val treasure = adventure.buyTreasure(coins)
}