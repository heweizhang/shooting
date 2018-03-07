/**
 * @apiDefine api_succeed 操作成功
 * @apiSuccessExample {json} 操作成功
 * {"c":0,"m":"操作成功","d": null}
 */
/**
 * @apiDefine api_response
 * @apiSuccess {integer} c z t m
 * @apiSuccess {String} m
 * @apiSuccess {json} d
 */

/**
 * @api {get} /user user
 * @apiGroup User
 * @apiUse api_response
 * @apiUse api_succeed
 */


/**
 * @api {get} /user2 user2
 * @apiGroup User2
 * @apiUse api_response
 * @apiUse api_succeed
 */