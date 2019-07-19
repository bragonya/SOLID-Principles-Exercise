package domain.di

import dagger.Component
import domain.TaxiDriver
import javax.inject.Singleton

@Singleton
@Component(modules = [WalletModule::class, CarModule::class])
interface ComponentTaxiDrive {
    fun inject(taxiDriver: TaxiDriver)
}