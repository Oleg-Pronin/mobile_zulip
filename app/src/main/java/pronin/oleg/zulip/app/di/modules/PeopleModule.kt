package pronin.oleg.zulip.app.di.modules

import dagger.Binds
import dagger.Module
import pronin.oleg.zulip.data.use_cases.people.GetAllPeopleUseCaseImpl
import pronin.oleg.zulip.data.use_cases.profile.GetOwnUserUseCaseImpl
import pronin.oleg.zulip.data.use_cases.profile.GetProfileUseCaseImpl
import pronin.oleg.zulip.domain.use_cases.people.GetAllPeopleUseCase
import pronin.oleg.zulip.domain.use_cases.profile.GetOwnUserUseCase
import pronin.oleg.zulip.domain.use_cases.profile.GetProfileUseCase

@Module
interface PeopleModule {
    @Binds
    fun bindGetOwnUserUseCase(getOwnUserUseCaseImpl: GetOwnUserUseCaseImpl): GetOwnUserUseCase

    @Binds
    fun bindGetProfileUseCase(getProfileUseCaseImpl: GetProfileUseCaseImpl): GetProfileUseCase

    @Binds
    fun bindGetAllPeopleUseCase(getAllPeopleUseCaseImpl: GetAllPeopleUseCaseImpl): GetAllPeopleUseCase
}
