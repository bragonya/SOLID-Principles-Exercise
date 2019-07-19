package domain.di

import dagger.Module
import dagger.Provides
import domain.Util
import domain.Wallet

@Module
class WalletModule {

    @Provides
    fun provideWallet(): Wallet{
        return Wallet(Util.randomNumber(70_000,100_000))
    }
}