package domain.di

import dagger.Module
import dagger.Provides
import domain.Car
import domain.Engine
import domain.TIRE_BRANDS
import domain.Tire

@Module
class CarModule {

    @Provides
    fun provideEngine(): Engine =Engine(sparkState = true, pistonsState = true)

    @Provides
    fun provideTires(): ArrayList<Tire> = arrayListOf(Tire(true, TIRE_BRANDS.FIRESTONE),
                Tire(true, TIRE_BRANDS.BRIDGESTONE),
                Tire(true, TIRE_BRANDS.FIRESTONE),
                Tire(true, TIRE_BRANDS.MICHELIN))

    @Provides
    fun provideCar(tires:ArrayList<Tire>, engine: Engine):Car {
        return Car(tires, engine)
    }

}