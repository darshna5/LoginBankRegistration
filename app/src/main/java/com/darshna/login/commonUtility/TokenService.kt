package com.darshna.login.commonUtility

interface TokenService {

  fun getToken(scope: NextScope): AuthorizationToken?

  fun setToken(scope: NextScope, token: AuthorizationToken)

  fun clearToken(scope: NextScope)

  fun clear()

  fun hasToken(scope: NextScope): Boolean

  fun getHighestScope(): NextScope?

}
