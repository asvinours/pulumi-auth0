// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Multi-Factor Authentication works by requiring additional factors during the login process to prevent unauthorized access. With this resource you can configure some options available for MFA.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewGuardian(ctx, "myGuardian", &auth0.GuardianArgs{
//				Duo: &auth0.GuardianDuoArgs{
//					Enabled:        pulumi.Bool(true),
//					Hostname:       pulumi.String("api-hostname"),
//					IntegrationKey: pulumi.String("someKey"),
//					SecretKey:      pulumi.String("someSecret"),
//				},
//				Email: pulumi.Bool(true),
//				Otp:   pulumi.Bool(true),
//				Phone: &auth0.GuardianPhoneArgs{
//					Enabled: pulumi.Bool(true),
//					MessageTypes: pulumi.StringArray{
//						pulumi.String("sms"),
//						pulumi.String("voice"),
//					},
//					Options: &auth0.GuardianPhoneOptionsArgs{
//						EnrollmentMessage:   pulumi.String("{{code}} is your verification code for {{tenant.friendly_name}}. Please enter this code to verify your enrollment."),
//						VerificationMessage: pulumi.String("{{code}} is your verification code for {{tenant.friendly_name}}."),
//					},
//					Provider: pulumi.String("auth0"),
//				},
//				Policy: pulumi.String("all-applications"),
//				Push: &auth0.GuardianPushArgs{
//					AmazonSns: &auth0.GuardianPushAmazonSnsArgs{
//						AwsAccessKeyId:                pulumi.String("test1"),
//						AwsRegion:                     pulumi.String("us-west-1"),
//						AwsSecretAccessKey:            pulumi.String("secretKey"),
//						SnsApnsPlatformApplicationArn: pulumi.String("test_arn"),
//						SnsGcmPlatformApplicationArn:  pulumi.String("test_arn"),
//					},
//					CustomApp: &auth0.GuardianPushCustomAppArgs{
//						AppName:       pulumi.String("CustomApp"),
//						AppleAppLink:  pulumi.String("https://itunes.apple.com/us/app/my-app/id123121"),
//						GoogleAppLink: pulumi.String("https://play.google.com/store/apps/details?id=com.my.app"),
//					},
//					Enabled:  pulumi.Bool(true),
//					Provider: pulumi.String("sns"),
//				},
//				RecoveryCode: pulumi.Bool(true),
//				WebauthnPlatform: &auth0.GuardianWebauthnPlatformArgs{
//					Enabled: pulumi.Bool(true),
//				},
//				WebauthnRoaming: &auth0.GuardianWebauthnRoamingArgs{
//					Enabled:          pulumi.Bool(true),
//					UserVerification: pulumi.String("required"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// As this is not a resource identifiable by an ID within the Auth0 Management API, guardian can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example
//
// ```sh
//
//	$ pulumi import auth0:index/guardian:Guardian my_guardian 24940d4b-4bd4-44e7-894e-f92e4de36a40
//
// ```
type Guardian struct {
	pulumi.CustomResourceState

	// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
	Duo GuardianDuoOutput `pulumi:"duo"`
	// Indicates whether email MFA is enabled.
	Email pulumi.BoolPtrOutput `pulumi:"email"`
	// Indicates whether one time password MFA is enabled.
	Otp pulumi.BoolPtrOutput `pulumi:"otp"`
	// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
	Phone GuardianPhoneOutput `pulumi:"phone"`
	// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
	Push GuardianPushOutput `pulumi:"push"`
	// Indicates whether recovery code MFA is enabled.
	RecoveryCode pulumi.BoolPtrOutput `pulumi:"recoveryCode"`
	// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
	WebauthnPlatform GuardianWebauthnPlatformOutput `pulumi:"webauthnPlatform"`
	// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
	WebauthnRoaming GuardianWebauthnRoamingOutput `pulumi:"webauthnRoaming"`
}

// NewGuardian registers a new resource with the given unique name, arguments, and options.
func NewGuardian(ctx *pulumi.Context,
	name string, args *GuardianArgs, opts ...pulumi.ResourceOption) (*Guardian, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Guardian
	err := ctx.RegisterResource("auth0:index/guardian:Guardian", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGuardian gets an existing Guardian resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGuardian(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GuardianState, opts ...pulumi.ResourceOption) (*Guardian, error) {
	var resource Guardian
	err := ctx.ReadResource("auth0:index/guardian:Guardian", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Guardian resources.
type guardianState struct {
	// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
	Duo *GuardianDuo `pulumi:"duo"`
	// Indicates whether email MFA is enabled.
	Email *bool `pulumi:"email"`
	// Indicates whether one time password MFA is enabled.
	Otp *bool `pulumi:"otp"`
	// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
	Phone *GuardianPhone `pulumi:"phone"`
	// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
	Policy *string `pulumi:"policy"`
	// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
	Push *GuardianPush `pulumi:"push"`
	// Indicates whether recovery code MFA is enabled.
	RecoveryCode *bool `pulumi:"recoveryCode"`
	// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
	WebauthnPlatform *GuardianWebauthnPlatform `pulumi:"webauthnPlatform"`
	// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
	WebauthnRoaming *GuardianWebauthnRoaming `pulumi:"webauthnRoaming"`
}

type GuardianState struct {
	// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
	Duo GuardianDuoPtrInput
	// Indicates whether email MFA is enabled.
	Email pulumi.BoolPtrInput
	// Indicates whether one time password MFA is enabled.
	Otp pulumi.BoolPtrInput
	// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
	Phone GuardianPhonePtrInput
	// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
	Policy pulumi.StringPtrInput
	// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
	Push GuardianPushPtrInput
	// Indicates whether recovery code MFA is enabled.
	RecoveryCode pulumi.BoolPtrInput
	// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
	WebauthnPlatform GuardianWebauthnPlatformPtrInput
	// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
	WebauthnRoaming GuardianWebauthnRoamingPtrInput
}

func (GuardianState) ElementType() reflect.Type {
	return reflect.TypeOf((*guardianState)(nil)).Elem()
}

type guardianArgs struct {
	// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
	Duo *GuardianDuo `pulumi:"duo"`
	// Indicates whether email MFA is enabled.
	Email *bool `pulumi:"email"`
	// Indicates whether one time password MFA is enabled.
	Otp *bool `pulumi:"otp"`
	// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
	Phone *GuardianPhone `pulumi:"phone"`
	// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
	Policy string `pulumi:"policy"`
	// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
	Push *GuardianPush `pulumi:"push"`
	// Indicates whether recovery code MFA is enabled.
	RecoveryCode *bool `pulumi:"recoveryCode"`
	// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
	WebauthnPlatform *GuardianWebauthnPlatform `pulumi:"webauthnPlatform"`
	// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
	WebauthnRoaming *GuardianWebauthnRoaming `pulumi:"webauthnRoaming"`
}

// The set of arguments for constructing a Guardian resource.
type GuardianArgs struct {
	// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
	Duo GuardianDuoPtrInput
	// Indicates whether email MFA is enabled.
	Email pulumi.BoolPtrInput
	// Indicates whether one time password MFA is enabled.
	Otp pulumi.BoolPtrInput
	// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
	Phone GuardianPhonePtrInput
	// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
	Policy pulumi.StringInput
	// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
	Push GuardianPushPtrInput
	// Indicates whether recovery code MFA is enabled.
	RecoveryCode pulumi.BoolPtrInput
	// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
	WebauthnPlatform GuardianWebauthnPlatformPtrInput
	// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
	WebauthnRoaming GuardianWebauthnRoamingPtrInput
}

func (GuardianArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*guardianArgs)(nil)).Elem()
}

type GuardianInput interface {
	pulumi.Input

	ToGuardianOutput() GuardianOutput
	ToGuardianOutputWithContext(ctx context.Context) GuardianOutput
}

func (*Guardian) ElementType() reflect.Type {
	return reflect.TypeOf((**Guardian)(nil)).Elem()
}

func (i *Guardian) ToGuardianOutput() GuardianOutput {
	return i.ToGuardianOutputWithContext(context.Background())
}

func (i *Guardian) ToGuardianOutputWithContext(ctx context.Context) GuardianOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GuardianOutput)
}

func (i *Guardian) ToOutput(ctx context.Context) pulumix.Output[*Guardian] {
	return pulumix.Output[*Guardian]{
		OutputState: i.ToGuardianOutputWithContext(ctx).OutputState,
	}
}

// GuardianArrayInput is an input type that accepts GuardianArray and GuardianArrayOutput values.
// You can construct a concrete instance of `GuardianArrayInput` via:
//
//	GuardianArray{ GuardianArgs{...} }
type GuardianArrayInput interface {
	pulumi.Input

	ToGuardianArrayOutput() GuardianArrayOutput
	ToGuardianArrayOutputWithContext(context.Context) GuardianArrayOutput
}

type GuardianArray []GuardianInput

func (GuardianArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Guardian)(nil)).Elem()
}

func (i GuardianArray) ToGuardianArrayOutput() GuardianArrayOutput {
	return i.ToGuardianArrayOutputWithContext(context.Background())
}

func (i GuardianArray) ToGuardianArrayOutputWithContext(ctx context.Context) GuardianArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GuardianArrayOutput)
}

func (i GuardianArray) ToOutput(ctx context.Context) pulumix.Output[[]*Guardian] {
	return pulumix.Output[[]*Guardian]{
		OutputState: i.ToGuardianArrayOutputWithContext(ctx).OutputState,
	}
}

// GuardianMapInput is an input type that accepts GuardianMap and GuardianMapOutput values.
// You can construct a concrete instance of `GuardianMapInput` via:
//
//	GuardianMap{ "key": GuardianArgs{...} }
type GuardianMapInput interface {
	pulumi.Input

	ToGuardianMapOutput() GuardianMapOutput
	ToGuardianMapOutputWithContext(context.Context) GuardianMapOutput
}

type GuardianMap map[string]GuardianInput

func (GuardianMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Guardian)(nil)).Elem()
}

func (i GuardianMap) ToGuardianMapOutput() GuardianMapOutput {
	return i.ToGuardianMapOutputWithContext(context.Background())
}

func (i GuardianMap) ToGuardianMapOutputWithContext(ctx context.Context) GuardianMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GuardianMapOutput)
}

func (i GuardianMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Guardian] {
	return pulumix.Output[map[string]*Guardian]{
		OutputState: i.ToGuardianMapOutputWithContext(ctx).OutputState,
	}
}

type GuardianOutput struct{ *pulumi.OutputState }

func (GuardianOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Guardian)(nil)).Elem()
}

func (o GuardianOutput) ToGuardianOutput() GuardianOutput {
	return o
}

func (o GuardianOutput) ToGuardianOutputWithContext(ctx context.Context) GuardianOutput {
	return o
}

func (o GuardianOutput) ToOutput(ctx context.Context) pulumix.Output[*Guardian] {
	return pulumix.Output[*Guardian]{
		OutputState: o.OutputState,
	}
}

// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
func (o GuardianOutput) Duo() GuardianDuoOutput {
	return o.ApplyT(func(v *Guardian) GuardianDuoOutput { return v.Duo }).(GuardianDuoOutput)
}

// Indicates whether email MFA is enabled.
func (o GuardianOutput) Email() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Guardian) pulumi.BoolPtrOutput { return v.Email }).(pulumi.BoolPtrOutput)
}

// Indicates whether one time password MFA is enabled.
func (o GuardianOutput) Otp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Guardian) pulumi.BoolPtrOutput { return v.Otp }).(pulumi.BoolPtrOutput)
}

// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
func (o GuardianOutput) Phone() GuardianPhoneOutput {
	return o.ApplyT(func(v *Guardian) GuardianPhoneOutput { return v.Phone }).(GuardianPhoneOutput)
}

// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
func (o GuardianOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *Guardian) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
func (o GuardianOutput) Push() GuardianPushOutput {
	return o.ApplyT(func(v *Guardian) GuardianPushOutput { return v.Push }).(GuardianPushOutput)
}

// Indicates whether recovery code MFA is enabled.
func (o GuardianOutput) RecoveryCode() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Guardian) pulumi.BoolPtrOutput { return v.RecoveryCode }).(pulumi.BoolPtrOutput)
}

// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
func (o GuardianOutput) WebauthnPlatform() GuardianWebauthnPlatformOutput {
	return o.ApplyT(func(v *Guardian) GuardianWebauthnPlatformOutput { return v.WebauthnPlatform }).(GuardianWebauthnPlatformOutput)
}

// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
func (o GuardianOutput) WebauthnRoaming() GuardianWebauthnRoamingOutput {
	return o.ApplyT(func(v *Guardian) GuardianWebauthnRoamingOutput { return v.WebauthnRoaming }).(GuardianWebauthnRoamingOutput)
}

type GuardianArrayOutput struct{ *pulumi.OutputState }

func (GuardianArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Guardian)(nil)).Elem()
}

func (o GuardianArrayOutput) ToGuardianArrayOutput() GuardianArrayOutput {
	return o
}

func (o GuardianArrayOutput) ToGuardianArrayOutputWithContext(ctx context.Context) GuardianArrayOutput {
	return o
}

func (o GuardianArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Guardian] {
	return pulumix.Output[[]*Guardian]{
		OutputState: o.OutputState,
	}
}

func (o GuardianArrayOutput) Index(i pulumi.IntInput) GuardianOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Guardian {
		return vs[0].([]*Guardian)[vs[1].(int)]
	}).(GuardianOutput)
}

type GuardianMapOutput struct{ *pulumi.OutputState }

func (GuardianMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Guardian)(nil)).Elem()
}

func (o GuardianMapOutput) ToGuardianMapOutput() GuardianMapOutput {
	return o
}

func (o GuardianMapOutput) ToGuardianMapOutputWithContext(ctx context.Context) GuardianMapOutput {
	return o
}

func (o GuardianMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Guardian] {
	return pulumix.Output[map[string]*Guardian]{
		OutputState: o.OutputState,
	}
}

func (o GuardianMapOutput) MapIndex(k pulumi.StringInput) GuardianOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Guardian {
		return vs[0].(map[string]*Guardian)[vs[1].(string)]
	}).(GuardianOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GuardianInput)(nil)).Elem(), &Guardian{})
	pulumi.RegisterInputType(reflect.TypeOf((*GuardianArrayInput)(nil)).Elem(), GuardianArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GuardianMapInput)(nil)).Elem(), GuardianMap{})
	pulumi.RegisterOutputType(GuardianOutput{})
	pulumi.RegisterOutputType(GuardianArrayOutput{})
	pulumi.RegisterOutputType(GuardianMapOutput{})
}
